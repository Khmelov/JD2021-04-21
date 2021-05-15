package by.it.labovka.test;

import java.util.Scanner;
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
Scanner sc = new Scanner(System.in);
String name = sc.nextLine();
int y = sc.nextInt();
int m = sc.nextInt();
int d = sc.nextInt();
        System.out.printf("Меня зовут %s.\nЯ родился %d.%d.%d", name, d, m, y);
        }

    }

