public class Constructor {
    public static void main(String[] args) {
        Complex num1 = new Complex(2,9);
        Complex num2 = new Complex(3,4);
        num1.print();
        num2.print();
        System.out.println("After adding both the numbers");
        Complex newnum = num1.add(num2);
        newnum.print();
    }
}
class Complex{
    int a,b;
    public Complex(int real){
        a= real;
        b=10;
    }
    public Complex(int a,int b){
        this.a=a;
        this.b=b;
    }
    void print(){
        System.out.println(a+" + "+b+"i");
    }
    Complex add(Complex num2){
        return  new Complex(a+num2.a,b+num2.b);
    }
}
