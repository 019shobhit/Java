public class StringBuffers {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Shubhi");
        System.out.println(sb);
        sb.delete(2,6);
        sb.append("obhit");
        sb.insert(1,'V');
        System.out.println(sb);
    }
}
