public class NegativeResultException extends Exception {
    public NegativeResultException() {
        super("delta < 0");
    }
}
