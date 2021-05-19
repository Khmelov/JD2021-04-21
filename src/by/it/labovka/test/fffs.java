package by.it.labovka.test;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Ввести с клавиатуры строку name.
//Ввести с клавиатуры дату рождения (три числа): y, m, d.
//
//Вывести на экран текст:
//"Меня зовут name.
//Я родился d.m.y"
//
//Пример вывода:
public class fffs {
    public static void main(String[] args) {
        Pattern p = Pattern.compile("g");
        Matcher m = p.matcher("fffggg");
while(m.find())
{
    System.out.print(m.start()+ " " + m.group() + " ");
}
    }
}

