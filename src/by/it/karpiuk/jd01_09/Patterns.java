package by.it.karpiuk.jd01_09;

public class Patterns {

    static final String operation = "[+-/*]";
    static final String SCALAR = "-?[0-9]+(\\.[0-9]+)?";
    static final String VECTOR = "\\{" + SCALAR + "(," + SCALAR + ")*}";

}
