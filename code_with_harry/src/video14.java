public class video14 {
    public static void main(String[] args) {
        String name = "Shobhit";
        int length = name.length();
        System.out.println(length);
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(3));
        System.out.println(name.replace("o","u"));
        System.out.println(name.startsWith("Sh"));
        System.out.println(name.endsWith("t"));
        System.out.println(name.charAt(5));
        System.out.println(name.equals("Shobhit"));
        System.out.println(name.equalsIgnoreCase("shobhit"));
        System.out.println("I am escape sequence \" \\ hello ji");
    }
}