import java.util.Random;
import java.util.Scanner;
/*public class work2 {




    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int n = 0;
        do {
            System.out.println("Введите число >3");
            n = scanner.nextInt();
            if (n <= 3)
                System.out.println("Ввели неверно");
        } while (n <= 3);

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(n + 1);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int chetCount = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0)
                chetCount++;
        }
        int chetIndex=0;
        int arrayChet[] = new int[chetCount];
        for (int i =0 ; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                arrayChet[chetIndex] = array[i];
                chetIndex++;
                System.out.print(arrayChet[chetIndex-1] + "\t ");
            }

        }

    }






    public static void main13(String[] args) {
        Random random = new Random();
        int array[] = new int[10];
        for ( int i=0;i<array.length;i++){
            array[i] = random.nextInt(101);
            System.out.print(array[i] + "\t");
        }

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                  }

           }

        }
        System.out.println();
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + "\t");
        }
    }








    public static void main11(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int a[] = new int[5];
        int n;
        do {
            System.out.println("Введите целое число меншее" + " " + a.length);
            n = scanner.nextInt();
            if (n >= 10) {
                System.out.println("Вы ввели неверное число");
            }
        } while (n > a.length);
        for (int i = 0; i < a.length; i++) {
            a[i] = 20 + random.nextInt(81);
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int temp;
        for (int j = 0; j < n; j++) {
            temp = a[a.length - 1];
            for (int i = a.length - 1; i > 0; i--) {
                //System.out.print(temp + "\t");
                a[i] = a[i - 1];
        }
            a[0] = temp;
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
            }
        }
    }






    public static void main2(String[] args) {
        Random random = new Random();
        int[] a = new int[6];
        for (int i = 0; i < a.length; i++) {
            a[i] = 20 + random.nextInt(81);
            System.out.print(a[i] + "\t ");
        }
        int maxChet = 0, maxChetIndex = 0, minNchetIndex = 0;
        int minNchet = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 != 0) {
                minNchet = a[i];
                break;
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                if (a[i] > maxChet) {
                    maxChet = a[i];
                    maxChetIndex = i;

                }
            } else {
                if (a[i] < minNchet) {
                    minNchet = a[i];
                    minNchetIndex = i;
                }
            }
        }
        a[maxChetIndex] = minNchet;
        a[minNchetIndex] = maxChet;
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + "\t ");
        }
        System.out.println();
        System.out.println("MaxChet= " + maxChet + " " + "MinNchet=" + minNchet);


    }











    public static void main1(String[] args) {
        Random random = new Random();
        int[] a = new int[10];
        int[] b  = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = 20 + random.nextInt(81);
            System.out.print(a[i] + "\t ");
        }
        int i = 0;
        int z = 0;
        while (i < a.length) {
            if (a[i] % 2 == 0) {
                b[z] = a[i];
                z++;
            }
            i++;
        }
        i = 0;
        while (i < a.length) {
            if (a[i] % 2 != 0) {
                b[z] = a[i];
                z++;
            }
            i++;
        }
        System.out.println();

            for (int k = 0; k < b.length; k++) {
                System.out.print(b[k] + "\t ");
            }
        }
    }

    public static void main23(String[] args) {
        int x = 20;
        int y = 11;
        for (int i = 4; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if ((i==6&&j==10))
                    System.out.print("Ж");
                else if (j < (x / 2 + i) - y / 2 && j > ((x / 2 - i) + y / 2))
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = 4; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (j < (x / 2 + i) - y / 3 && j > ((x / 2 - i) + y / 3))
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

        for (int i = 1; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (j < (x / 2 + i) && j > (x / 2 - i))
                    System.out.print("*");

                else
                    System.out.print(" ");
            }
            System.out.println();


        }
        for (int i = 1; i < y; i++) {
            for (int j = 0; j < x; j++) {
                if (j <= (x / 2 + 2)&& j>=(x/2-2)&& i<5 )
                    System.out.print("^");
                else  if ((i==1&&j==4)||(i==1&&j==16 ))
                    System.out.print("O");
                else
                    System.out.print(" ");
            }
            System.out.println();


        }


    }
}
*/