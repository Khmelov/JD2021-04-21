package by.it.krukouski.jd02_06.taskB;

public class CalcException extends Exception{
    public CalcException() {
    }

    public CalcException(String message) {
        super("ERROR: " + message);
        ConsoleRunner.logger.log(message);
    }

    public CalcException(String message, Throwable cause) {
        super("ERROR: " + message, cause);
    }

    public CalcException(Throwable cause) {
        super(cause);
    }
}
