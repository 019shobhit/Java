public class Main{
    public static void main(String[] args) {
        child c = new child();
        c.prop();
    }
}
interface father{
    int p = 10;
    void prop();
}
interface mother{
    int p = 20;
    void prop();
}
class child implements father , mother{

    @Override
    public void prop() {
        System.out.println(father.p+mother.p);
    }
}