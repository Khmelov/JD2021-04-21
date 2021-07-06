package by.it.sapazhkou.jd02_04;

import org.w3c.dom.ranges.RangeException;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class VarRepo {

    private static final String VARS_TXT = "vars.txt";
    private static final Map<String, Var> vars = new HashMap<>();
    private static final String FILE_NAME = PathCreator.getFileName(ConsoleRunner.class, VARS_TXT);

    private VarRepo(){
    }

    static void save(String name, Var value) {
        vars.put(name, value);
    }

    public static boolean contain(String name) {
        return vars.containsKey(name);
    }

    public static Var load(String name) {
        return vars.get(name);
    }

    static void saveVars() {
        try (PrintWriter printWriter = new PrintWriter(FILE_NAME)) {
            for (Map.Entry<String, Var> varPair : vars.entrySet()){
                printWriter.printf("%s=%s\n", varPair.getKey(), varPair.getValue());
            }
        } catch (FileNotFoundException e){
            throw new RuntimeException(e);
        }
    }

    static void loadVars() {
        Path path = Paths.get(FILE_NAME);
        if(Files.exists(path)){
            try {
                Parser parser = new Parser();
                Files.lines(path).forEach(stringValue -> eval(parser, stringValue));
            }catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private static void eval (Parser parser, String stringValue){
        try {
            parser.evaluate(stringValue);
        } catch (CalcException e) {
            e.printStackTrace();
        }
    }
}
