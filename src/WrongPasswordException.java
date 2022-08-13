public class WrongPasswordException extends RuntimeException{
    public WrongPasswordException() {
        super();
    }
    public WrongPasswordException(String message) {
        super(message);
    }
    public WrongPasswordException(String message, Throwable t) {
        super(message, t);
    }
    public WrongPasswordException(Throwable t) {
        super(t);
    }
}
