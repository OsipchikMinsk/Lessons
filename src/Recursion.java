/*
1) показать на экран числа от 1 до 10 рекурсивно (без цикла)
    2) посчитать сумму чисел от A до В рекурсивно (похоже на факториал)
    3) 4) вывести на экран и посчитать сумму цифр числа
    разные порядки вывода цифр
    *5) фибоначи
    *6) фибоначи циклом (+ массива) (*без массива)
    *
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        oneToTen(1);
        System.out.println();
        prinLine();
        System.out.println("Задача 2");
        System.out.println(summAB(1, 5));
        prinLine();
        System.out.println("Задача 6");
        fibonachi();
        System.out.println();
        prinLine();
        System.out.println("Задача 3,4");
        rEnd(12345);
        System.out.println();
        rBegin(12345);
        System.out.println();
        System.out.println(summ(1135555));
        prinLine();
        System.out.println("Задача 5");
        fi(20);
        System.out.println();

    }

    public static void oneToTen(int a) {
        if (a == 11)
            return;
        System.out.print(a + "\t");
        oneToTen(a + 1);
    }

    public static void prinLine() {
        System.out.println("======================================");
    }

    public static int summAB(int a, int b) {
        int summ = 0;
        if (a > b)
            return 0;
        if (a == b)
            return summ + a;
        int res = summAB(a + 1, b - 1);
        summ = a + b + res;
        return summ;

    }

    public static void fibonachi() {
        int c, a = 1, b = 1;
        for (int i = 0; i < 20; i++) {
            if (i < 2)
                c = 1;
            else
                c = a + b;
            a = b;
            b = c;
            System.out.print(c + "\t");
        }
    }

    public static int rEnd(int a) {

        int d = a % 10;
        System.out.print(d + " ");
        if (a < 10)
            return a % 10;
        rEnd(a / 10);
        return d;
    }

    public static int rBegin(int a) {
        int d = a / 10;
        System.out.print(d + "\t");
        if (a < 10)
            return a % 10;
        rEnd(a % 10);
        return d;
    }

    public static int summ(int a) {
        int summ = a % 10;
        if (a < 10)
            return summ;
        summ = summ + summ(a / 10) % 10;
        //System.out.println(summ);
        return summ;
    }

    public static int[] fi(int a) {
        int arrayFi[] = new int[a];
        for (int i = 0; i < a; i++) {
            if (i == 0 || i == 1) {
                arrayFi[i] = 1;
            }
            if (i > 1)
                arrayFi[i] = arrayFi[i - 2] + arrayFi[i - 1];
            System.out.print(arrayFi[i] + "\t");
        }
        return arrayFi;
    }



}

