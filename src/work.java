import java.util.Random;
import java.util.Scanner;

public class work {

    public static void main(String[] args) {
        int array[] = {31, 28, 31, 30, 31, 30, 31, 31, 31, 30, 30, 31};
        Scanner scanner = new Scanner(System.in);
        int day = 32, month = 13, year = 0, qty = 0;
        System.out.println("Введите год");
        year = scanner.nextInt();
        System.out.println("Введите месяц");

        while (month > 12) {
            month = scanner.nextInt();
            if (month > 12)
                System.out.println("Введите число меньшее или равное 12");
        }
        System.out.println("Введите день");
        while (day > 31) {
            day = scanner.nextInt();
            if (day > 31)
                System.out.println("Введите число меншее или равное31");
        }
        for (int i = 0; i < month - 1; i++) {
            qty = qty + array[i];

        }
        if (month > 2 && year % 4 == 0 || year % 100 == 0 && year % 400 == 0 && month > 2)
            qty = qty + 1;
        qty = qty + day;
        System.out.println(qty);
    }

    public static void main22(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int lmax = 1, l = 1, index = 0;
        System.out.println();
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i - 1]) {
                l = l + 1;
                if (i == array.length - 1)
                    index = i;
            }
            if ((array[i] <= array[i - 1]) || i == array.length - 1) {
                if (l > lmax)
                    lmax = l;
                int arrayMax[] = new int[lmax];
                for (int j = 0; j < lmax; j++) {
                    arrayMax[j] = array[i - lmax + j];
                }
                l = 1;
            }
        }
        System.out.println(lmax);
        System.out.println();


    }

    public static void main21(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = -10 + random.nextInt(20);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > 0)
                count = count + 1;
        }
        System.out.println("кол-во положительных элементов в массиве =" + count);
        count = 0;
        System.out.println("===========================");
        int min = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] < min)
                min = array[i];
        }
        System.out.println("Min=" + min);
        for (int i = 0; i < size; i++) {
            if (array[i] == min + 5) {
                count = count + 1;
                System.out.println(array[i] + ">" + min + "на пять");
            }


        }
        System.out.println(count);

    }


    public static void main20(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = -100 + random.nextInt(150);
            System.out.print(array[i] + "\t");
        }
        int max = array[0], count = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] > max)
                max = array[i];
        }
        System.out.println();
        System.out.println("Max=" + max);
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (Math.abs(array[i]) > max) {
                count = count + 1;
                System.out.println(count + ")" + Math.abs(array[i]) + ">" + max);
            }
        }
        System.out.println("Всего элементов превосходит по модулю макс элемент" + count);
    }

}





