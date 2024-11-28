package myPackage;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Date;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.JsonObject;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public Servlet() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String city = request.getParameter("cn");
        String apiKey = "626979d1bee43967a97aaf9a6006cbaf";
        String encodedCity = URLEncoder.encode(city, "UTF-8");
        String apiUrl = "https://api.openweathermap.org/data/2.5/weather?q=" + encodedCity + "&appid=" + apiKey;

        HttpURLConnection con = null;
        InputStream is = null;
        InputStreamReader rdr = null;
        Scanner sc = null;

        try {
            URL url = new URL(apiUrl);
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(5000); // Set connection timeout
            con.setReadTimeout(5000); // Set read timeout

            int status = con.getResponseCode();
            if (status != HttpURLConnection.HTTP_OK) {
                response.getWriter().write("Error: Unable to fetch weather data. Response Code: " + status);
                return;
            }

            is = con.getInputStream();
            rdr = new InputStreamReader(is);
            sc = new Scanner(rdr);
            StringBuilder sb = new StringBuilder();

            while (sc.hasNext()) {
                sb.append(sc.nextLine());
            }

            Gson gson = new Gson();
            JsonObject jsonObject = gson.fromJson(sb.toString(), JsonObject.class);

            // Date & Time
            long dateTimestamp = jsonObject.get("dt").getAsLong() * 1000;
            String date = new Date(dateTimestamp).toString();

            // Temperature
            double temperatureKelvin = jsonObject.getAsJsonObject("main").get("temp").getAsDouble();
            int temperatureCelsius = (int) (temperatureKelvin - 273.15);

            // Humidity
            int humidity = jsonObject.getAsJsonObject("main").get("humidity").getAsInt();

            // Wind Speed
            double windSpeed = jsonObject.getAsJsonObject("wind").get("speed").getAsDouble();

            // Weather Condition
            String weatherCondition = jsonObject.getAsJsonArray("weather").get(0).getAsJsonObject().get("main").getAsString();

            request.setAttribute("date", date);
            request.setAttribute("city", city);
            request.setAttribute("temperature", temperatureCelsius);
            request.setAttribute("weatherCondition", weatherCondition);
            request.setAttribute("humidity", humidity);
            request.setAttribute("windSpeed", windSpeed);
            request.setAttribute("weatherData", sb.toString());

            request.getRequestDispatcher("index.jsp").forward(request, response);
        } catch (IOException e) {
            response.getWriter().write("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
            if (rdr != null) {
                try {
                    rdr.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (con != null) {
                con.disconnect();
            }
        }
    }
}
