package by.it.krukouski.jd02_06.taskC;

import java.util.Locale;
import java.util.Scanner;

public class ConsoleRunner {
    static final String KEY_WORD = "end";
    public static ResMan manager = ResMan.INSTANCE;
    public static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) throws CalcException {
        Printer printer = new Printer();
        Parser parser = new Parser();
        Time time = new Time();
//        WriterReport writerReport = new WriterReport();
//        ReportBuilder reportBuilder = new MainReport();
//        writerReport.setReportBuilder(reportBuilder);
//        writerReport.constructReport();
//        Report report = writerReport.getReportBuilder();
//        System.out.println(report);
        Logger.getLogger().log("start program" + " " + time.getTime());
        chooseLanguage(scanner);
        System.out.println(manager.get(Errors.keyWord));
        calc(printer, parser, scanner);
        Logger.getLogger().log("finish program" + " " + time.getTime());
    }

    private static void calc(Printer printer, Parser parser, Scanner scanner) {
        for (; ; ) {
            String expression = scanner.nextLine();
            if (!expression.equals(KEY_WORD)) {
                try {
                    Logger.getLogger().log("expression: " + expression);
                    Var var = parser.calc(expression);
                    printer.print(var);
                    Logger.getLogger().log("result: " + var.toString());
                } catch (CalcException e) {
                    System.out.println(e.getMessage());
                }
            } else {
                break;
            }
        }
    }

    private static void chooseLanguage(Scanner scanner) {
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
    }
}
