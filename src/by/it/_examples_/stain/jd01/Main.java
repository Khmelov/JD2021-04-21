package by.it._examples_.stain.jd01;

public class Main {

    public static void main(String[] args) {

        Integer number = 17;

        // Бинарный формат числа
        String convert = Integer.toBinaryString(number);
        System.out.println(convert);

        // Восьмиричная форма
        convert = Integer.toOctalString(number);
        System.out.println(convert);

        // Шеснадцатиричная форма
        convert = Integer.toHexString(number);
        System.out.println(convert);
    }
}