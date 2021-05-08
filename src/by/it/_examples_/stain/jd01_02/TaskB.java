/*В классе TaskB (пакет by.it.familiya.jd01_02) создайте Scanner и методы:
static void step1()
static void step2(int month)
static void step3(double a, double b, double c)
вызовите их один раз из метода main. Эти методы решают такие задачи:
1. step1() выводит числа от 1 до 25 в виде матрицы N x N слева направо и
сверху вниз (т.е. N = 5). После каждого числа один пробел.
2. В main ввести с консоли через объект типа Scanner число от 1 до 12 и с
ним вызвать метод step2(int month), который выводит на консоль русское
название месяца строчными буквами, соответствующего этому числу через
switch. Сообщить об ошибке “нет такого месяца” для некорректных чисел
во вводе (это должна быть default – ветка для switch).
3. Рассчитайте и выведите корни (или один корень) квадратного уравнения.
Если корня нет, то нужно вывести сообщение “корней нет”.
Параметры (a b c) уравнения нужно вводить в main через тот же Scanner и
затем передавать в метод step3(double a, double b, double c).
Для извлечения 𝐷 используйте метод Math.sqrt(дискриминант)*/

package by.it._examples_.stain.jd01_02;

import java.util.Scanner;


public class TaskB {
    public static void main(String[] args) {
        step1();
        Scanner s = new Scanner(System.in);
        System.out.println("Введите число от 1 до 12");
        int month = s.nextInt();
        step2(month);
        System.out.println("Введите 3 числа: ");
        double a = s.nextInt();
        double b = s.nextInt();
        double c = s.nextInt();


        step3(a, b, c);


    }


    private static void step1() {
        int[][] array = new int[5][5];
        int x = 1;

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 5; j++) {
                array[i][j] = x;
                x++;


            }

        }
        for (int i = 0; i < 5; i++, System.out.println()) {
            for (int j = 0; j < 5; j++) {
                System.out.print(array[i][j] + " ");

            }
        }
    }

    private static void step2(int month) {
        switch (month) {
            case 1:
                System.out.println("январь");
                break;
            case 2:
                System.out.println("февраль");
                break;
            case 3:
                System.out.println("март");
                break;
            case 4:
                System.out.println("апрель");
                break;
            case 5:
                System.out.println("май");
                break;
            case 6:
                System.out.println("июнь");
                break;
            case 7:
                System.out.println("июль");
                break;
            case 8:
                System.out.println("август");
                break;
            case 9:
                System.out.println("сентябрь");
                break;
            case 10:
                System.out.println("октябрь");
                break;
            case 11:
                System.out.println("ноябрь");
                break;
            case 12:
                System.out.println("декабрь");
                break;
            default:
                System.out.println("нет такого месяца");


        }


    }

    private static void step3(double a, double b, double c) {

        double D;
        D = b * b - 4 * a * c;
        if (D > 0) {
            double x1, x2;
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            System.out.println("Корни уравнения: x1 = " + x1 + ", x2 = " + x2);
        } else if (D == 0) {
            double x;
            x = -b / (2 * a);
            System.out.println("Уравнение имеет единственный корень: x = " + x);
        } else {
            System.out.println("корней нет");
        }


    }
}
