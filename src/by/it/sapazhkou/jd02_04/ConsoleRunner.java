package by.it.sapazhkou.jd02_04;

import java.util.Scanner;

public class ConsoleRunner {

    static final String KEY_STOP_APP = "end";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //       String line;

        Parser parser = new Parser();
        Printer printer = new Printer();
        VarRepo.loadVars();

        for(; ;){
            String expression = scanner.nextLine();
            if(!expression.equals(KEY_STOP_APP)){
                Var var = null;
                try {
                    var = parser.evaluate(expression);
                    printer.print(var);
                } catch (CalcException e) {
                    printer.print(e);
                }
            } else {
                VarRepo.saveVars();
                break;
            }
        }
    }
}
