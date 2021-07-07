package by.it.krukouski.jd02_06.taskB;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleRunner {
    static final String KEY_WORD = "end";
    public static ResMan manager = ResMan.INSTANCE;
    public static Logger logger = Logger.INSTANCE;
    public static Time time = new Time();


    public static void main(String[] args) throws CalcException {
        Printer printer = new Printer();
        Parser parser = new Parser();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose language: be en ru");
        String language = scanner.nextLine();
        switch (language) {
            case "ru":
                manager.set(new Locale("ru", "RU"));
                break;
            case "en":
                manager.set(new Locale("en", "US"));
                break;
            case "be":
                manager.set(new Locale("be", "BY"));
                break;
        }
        System.out.println(manager.get(Errors.keyWord));

        for (; ; ) {
            String expression = scanner.nextLine();
            if (!expression.equals(KEY_WORD)) {
                try {
                    logger.log("expression: " + expression + " " + time.getTime());
                    Var var = parser.calc(expression);
                    printer.print(var);
                    logger.log("result: " + var.toString() + " " + time.getTime());
                } catch (CalcException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                break;
            }
        }


    }
}
