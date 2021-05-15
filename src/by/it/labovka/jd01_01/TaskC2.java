package by.it.labovka.jd01_01;

import java.math.BigInteger;
import java.util.Scanner;

/* Нужно написать программу, которая вводит два числа с клавиатуры
и 4 раза выводит их сумму с обозначением системы счисления на экран в
ДЕСЯТИЧНОМ ДВОИЧНОМ ШЕСТНАДЦАТИРИЧНОМ ВОСЬМИРИЧНОМ виде

Вот пример ввода с клавиатуры:
34 26

Тогда вывод ожидается такой (обратите внимание на регистр букв):
DEC:34+26=60
BIN:100010+11010=111100
HEX:22+1a=3c
OCT:42+32=74

Допускается свободное использование любых методов стандартной библиотеки
*/
class TaskC2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.printf("DEC:%d+%d=%d\n", a, b, a+ b);
        System.out.printf("BIN:%d+%d=%d\n", toBinary(a), toBinary(b), toBinary(a+b));
        System.out.printf("HEX:%d+%d=%d\n", toOctal(a), toOctal(b), toOctal(a+ b));
        System.out.printf("OCT:%d+%d=%d\n", toHex(a), toHex(b), toHex(a+ b));
        Integer number = 255;


    }
public static int toBinary(int number)
{
    String convert = Integer.toBinaryString(number);
    return Integer.parseInt(convert, 2);
}
    public static int toOctal(int number)
    {
        String convert = Integer.toOctalString(number);
        return Integer.parseInt(convert, 8);
    }
    public static int toHex(int number)
    {
        String convert = Integer.toHexString(number).toUpperCase();
        return Integer.parseInt(convert,16);
    }
}
