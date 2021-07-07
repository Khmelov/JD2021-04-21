package by.it.stain.jd02_04;

public interface Patterns {
    String OPERATION = "(?<=[^-+*/=,{])([-+*/=])";
    String SCALAR = "-?[0-9]+\\.?[0-9]*";
    String VECTOR = " \\{((-?[0-9]+\\.?[0-9]*),?)+}";
    String MATRIX = "\\{(\\{((-?[0-9]+\\.?[0-9]*),?)+},?)+}";

}
