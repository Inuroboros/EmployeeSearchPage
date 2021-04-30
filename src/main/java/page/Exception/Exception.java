package page.Exception;

public class Exception extends ArithmeticException{
    public Exception() {
        super("Incorrect number");
    }

    public Exception(String s) {
        super(s);
    }
}
