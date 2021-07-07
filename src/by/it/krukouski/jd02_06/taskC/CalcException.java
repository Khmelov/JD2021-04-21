package by.it.krukouski.jd02_06.taskC;

public class CalcException extends Exception{
    public CalcException() {
    }

    public CalcException(String message) {
        super("ERROR: " + message);
        Logger.getLogger().log(message);
    }

    public CalcException(String message, Throwable cause) {
        super("ERROR: " + message, cause);
    }

    public CalcException(Throwable cause) {
        super(cause);
    }
}
