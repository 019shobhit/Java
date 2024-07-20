import java.util.Scanner;
public class vide19 {
    public static void main(String[] args) {
//        QUESTION 1
        /*
        int a = 10 ;
        if(a == 11){
            System.out.println("i am 11");
        }
        else {
            System.out.println("i am not 11");
         */
//        QUESTION 2
        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Subject Marks");
        int sub1 = sc.nextInt();
        System.out.println("Enter Second Subject Marks");
        int sub2 = sc.nextInt();
        System.out.println("Enter Third Subject Marks");
        int sub3 = sc.nextInt();
        float total = (sub1+sub2+sub3)/3f;
        if(sub1>33 || sub2>33 || sub3>33 || total>40){
            System.out.printf("You are Passed with %f marks",total);
        }
        else {
            System.out.println("You are fail");
         */
//        QUESION 3
        /*
        System.out.println("Enter your income to check how much tax you wail pay to govt.");
        Scanner sc = new Scanner(System.in);
        float income = sc.nextFloat();
        float tax = 0;
        if (income <250000) {
            tax = tax + 0;
        }
        else if(income >250000 && income <=500000){
            tax = tax + (income - 250000)*0.05f;
        }
        else if (income>500000 && income <=1000000){
            tax = tax + 12500+ (income - 500000)*0.20f;
        }
        else if(income>1000000){
            tax = tax + 112500 +(income - 1000000)*0.30f;
        }
        System.out.printf("total payable tax is : %f",tax);
        */
//        QUESTION 4
        /*
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        day = day % 7;
        System.out.println("Enter Day number to get day");
        switch (day){
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
        }
         */
//        QUESTION 5;
        /*
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if((year % 4) == 0){
            System.out.println("This is a leap year");
        }
        else {
            System.out.println("This is a non leap year");
        }
         */
//        QUESTION 6
        Scanner sc = new Scanner(System.in);
        String web = sc.next();
        System.out.println("Enter your website");
        if(web.endsWith(".com")){
            System.out.println("This is a commertial website");
        }
        else if (web.endsWith(".org")) {
            System.out.println("This is a Orginizational Website");
        }
        else if (web.endsWith(".in")){
            System.out.println("This is a indian website");
        }
    }
}
