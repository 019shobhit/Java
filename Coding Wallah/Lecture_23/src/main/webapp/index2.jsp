<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Weather App</title>
    <link rel="stylesheet" href="style.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css" />
    <style>
        * {
            margin: 0;
            padding: 0;
            box-sizing: border-box;
            font-family: "Ubuntu", sans-serif;
        }

        body {
            display: flex;
            height: 100vh;
            align-items: center;
            justify-content: center;
            background: linear-gradient(to right, #2b40ff, #07121a);
            color: #fff;
        }

        .mainContainer {
            width: 100%;
            max-width: 400px;
            padding: 20px;
            border-radius: 10px;
            background: rgba(255, 255, 255, 0.1);
            box-shadow: 0 14px 28px rgba(0, 0, 0, 0.25),
                0 10px 10px rgba(0, 0, 0, 0.22);
            backdrop-filter: blur(10px);
        }

        .searchInput {
            width: 100%;
            display: flex;
            padding: 10px;
            justify-content: center;
        }

        .searchInput input {
            width: 100%;
            height: 40px;
            outline: none;
            font-size: 1rem;
            color: #525050;
            padding: 5px 10px;
            border-radius: 20px;
            border: 1px solid #b3b3b3;
            transition: border 0.3s ease;
        }

        .searchInput input:focus {
            border: 1px solid #9c9dde;
        }

        .searchInput button {
            width: 40px;
            height: 40px;
            cursor: pointer;
            color: #9b9b9b;
            border-radius: 50%;
            margin-left: 10px;
            transition: all 0.3s ease;
            background-color: #fff;
            border: 1px solid #b3b3b3;
        }

        .searchInput button:hover {
            color: #fff;
            background-color: #9c9dde;
            border: 1px solid #9c9dde;
        }

        .weatherDetails {
            text-align: center;
            padding: 20px 0;
        }

        .weatherIcon {
            display: flex;
            justify-content: center;
            padding: 20px 0;
        }

        .weatherIcon img {
            width: 100px;
            height: auto;
        }

        .weatherDetails .temp {
            font-size: 2rem;
            margin-top: 10px;
        }

        .cityDetails {
            color: #fff;
            font-size: 2.5rem;
            text-align: center;
            margin-bottom: 10px;
        }

        .cityDetails .date {
            font-size: 1.2rem;
            color: #bbb;
        }

        .windDetails {
            display: flex;
            justify-content: space-around;
            margin-top: 20px;
        }

        .windDetails .humidityBox,
        .windDetails .windSpeed {
            text-align: center;
        }

        .windDetails img {
            max-height: 30px;
            margin-bottom: 5px;
        }

        .windDetails .humidity h2,
        .windDetails .windSpeed h2 {
            margin: 0;
            font-size: 1.5rem;
        }

        @media (max-width: 480px) {
            .mainContainer {
                width: 90%;
                padding: 15px;
            }

            .searchInput input {
                font-size: 0.9rem;
            }

            .cityDetails {
                font-size: 2rem;
            }

            .cityDetails .date {
                font-size: 1rem;
            }
        }
    </style>
</head>

<body>

    <div class="mainContainer">
        <form action="Servlet" method="post" class="searchInput">
            <input type="text" placeholder="Enter City Name" id="searchInput" name="cn" />
            <button id="searchButton"><i class="fa-solid fa-magnifying-glass"></i></button>
        </form>
        <div class="weatherDetails">
            <div class="weatherIcon">
                <img src="" alt="Weather Icon" id="weather-icon">
            </div>
            <h2 class="temp">${temperature} °C</h2>
            <input type="hidden" id="wc" value="${weatherCondition}" />
            <div class="cityDetails">
                <div class="desc"><strong>${city}</strong></div>
                <div class="date">${date}</div>
            </div>
            <div class="windDetails">
                <div class="humidityBox">
                    <img src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEhgr7XehXJkOPXbZr8xL42sZEFYlS-1fQcvUMsS2HrrV8pcj3GDFaYmYmeb3vXfMrjGXpViEDVfvLcqI7pJ03pKb_9ldQm-Cj9SlGW2Op8rxArgIhlD6oSLGQQKH9IqH1urPpQ4EAMCs3KOwbzLu57FDKv01PioBJBdR6pqlaxZTJr3HwxOUlFhC9EFyw/s320/thermometer.png" alt="Humidity">
                    <div class="humidity">
                        <span>Humidity</span>
                        <h2>${humidity}%</h2>
                    </div>
                </div>
                <div class="windSpeed">
                    <img src="https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiyaIguDPkbBMnUDQkGp3wLRj_kvd_GIQ4RHQar7a32mUGtwg3wHLIe0ejKqryX8dnJu-gqU6CBnDo47O7BlzCMCwRbB7u0Pj0CbtGwtyhd8Y8cgEMaSuZKrw5-62etXwo7UoY509umLmndsRmEqqO0FKocqTqjzHvJFC2AEEYjUax9tc1JMWxIWAQR4g/s320/wind.png" alt="Wind Speed">
                    <div class="wind">
                        <span>Wind Speed</span>
                        <h2>${windSpeed} km/h</h2>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <script>
        var weatherIcon = document.getElementById("weather-icon");
        var val = document.getElementById("wc").value;

        switch (val) {
            case 'Clouds':
                weatherIcon.src = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiwFTkt5z_dxU6w1UnS1PxiZV3HDiPGsAW5Lrsp09MnlCmkQre9GzO8MnGytaaY1eZoqBN6SMJ4U578_uDtiuXswovr1T3o-Kt5KK0mlN_zC0RDodJFaKHQ3Uk-HIZ3vuMvAKNJi8DDFwWA7F6BOxz78Oh-UePwJTuc3PG0ZIZypPE1xlMPl5z46joaEw/s320/Clouds.png";
                break;
            case 'Clear':
                weatherIcon.src = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEj7pmzNCftryAfpa1YBSzVeYtjgxDQnw09Ug0HVV47J8GEtHPYTH9hJgZ2M1k0YgE0pcZ1qekr4C14zyPCiVuQAfXLClK8Ww3hYB6v77yElP7Lo5BnUKo4n-w6yB17FAbw51WST6YKS0GMwyA4fYNxOZxEyNL6HhUfFRgVhOW0GyRdBRriMHFQ-qfh4cA/s320/sun.png";
                break;
            case 'Rain':
                weatherIcon.src = "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgDW_Ndw[_{{{CITATION{{{_1{](https://github.com/Formolin/Typora/tree/64971a86c4fa533a36fbe37cdec4608d720adf25/Java%2Fjsp03.md)[_{{{CITATION{{{_2{](https://github.com/Jonny023/Study/tree/2cb836a2fcea519a30846ab275b4aae5a3f88b9a/springmvc%2Fspringmvc-%E6%96%87%E4%BB%B6%E4%B8%8A%E4%BC%A0%E5%8F%8A%E9%A2%9D%E5%A4%96%E5%8F%82%E6%95%B0%E7%BB%91%E5%AE%9A.md)[_{{{CITATION{{{_3{](https://github.com/CoderDuMin/MyStudyNotes/tree/7e1afb4c520c7bc2b1a26c0243ebec8e0b37490e/SpringBoot%2F05.spring%20boot%20web%E5%BC%80%E5%8F%91%2F5.3.web%E5%BA%94%E7%94%A8%E5%BC%80%E5%8F%91%E4%B9%8B%E6%95%B4%E5%90%88jsp.md)[_{{{CITATION{{{_4{](https://github.com/KevinMP532/trabajo-prog/tree/5d4e28d8fab39f85d47b66e8ed85376c801ee92b/agenda-covid%2Ffrontend%2Fborrar%2Fborrar.php)[_{{{CITATION{{{_5{](https://github.com/Brandon-github/Weather-App/tree/74f1c9d0caea28081d1e0bc346804711b1be78d2/index.php)[_{{{CITATION{{{_6{](https://github.com/jonesjacklewis/phpWeatherApp/tree/237e223bc641ef6a3cf12385fa02ad3721e9c817/PHP%20Weather%20App%2Findex.php)