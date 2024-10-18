public class MyException extends Exception {
    MyException(String msg){
        super(msg);
    }
}
class xyz{
    static void pass(int n) throws  Exception{
        if(n < 30){
            throw  new MyException("pass ho gya");
        }
    }
}
