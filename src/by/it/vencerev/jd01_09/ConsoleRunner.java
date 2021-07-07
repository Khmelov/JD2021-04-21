package by.it.vencerev.jd01_09;

import javax.swing.text.html.parser.Parser;
import java.util.Scanner;

public class ConsoleRunner {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String line;

       Parser parser=new Parser();
       Printer printer=new Printer();

       while (!(line= scanner.nextLine()).equals("end")){
           Var result=parser.calc(line);
           printer.print(result);
       }

    }
}
