import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

import java.util.*;

public class massiv {
    public static void main(String[] args) {
        int array[] ={31,28,31,30,31,30,31,31,31,30,30,31};
        Scanner scanner = new Scanner(System.in);
        int day=32, month=13, year=0, qty =0;
        System.out.println("Введите год");
        year = scanner.nextInt();
        System.out.println("Введите месяц");

        while (month>12){
            month = scanner.nextInt();
            if (month>12)
                System.out.println("Введите число меньшее или равное 12");
        }
        System.out.println("Введите день");
        while (day>31){
            day = scanner.nextInt();
            if (day>31)
                System.out.println("Введите число меншее или равное31");
             }
    for (int i =0;i<month-1;i++){
        qty = qty+array[i];

        }
        if(month>2&&year%4==0||year%100==0&&year%400==0&&month>2)
            qty = qty+1;
     qty = qty +day;
        System.out.println(qty);
    }
    public static void main22(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        //int size = scanner.nextInt();
        int array[] = new  int[10];
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
                for (int j=0;j<lmax;j++){
                    arrayMax[j] = array[i-lmax+j];
                }
                l = 1;
                           }
              }
        System.out.println(lmax );
        System.out.println();


    }
    public static void main21(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = -10+random.nextInt(20);
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
            if (array[i]< min)
                min = array[i];
        }
        System.out.println("Min=" + min);
        for (int i = 0; i < size; i++) {
            if (array[i] == min + 5 ) {
                count = count + 1;
                System.out.println(array[i]+ ">" + min + "на пять");
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



    //задача на нахожднние предмаксимального элемната
    public static void main19(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i =0;i<size;i++){
            array [i] = random.nextInt(100);
            System.out.print(array[i] + "\t");
        }
            int max =array[0];
        int indexMax = 0;
        int beforMax = array[0];
        for (int i = 0; i < size; i++) {
            if (array[i] > max){
                max = array[i];
            indexMax = i;
            }
        }
        array[indexMax] = 0;
        System.out.println();
        for (int i = 0; i < size; i++) {
            if (array[i] > beforMax)
                beforMax = array[i];
        }
        System.out.println(beforMax);
    }

    public static void main18(String[] args) {
        //замена повторяющихся элементов на +1
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
            System.out.print(array[i] + " ");
        }
        System.out.println();


        int count;//сколько она длится?
        for (int i = 0; i < size - 3; i++) {
            if (array[i] == array[i + 1] && array[i + 1] == array[i + 2]) {
                count = 3;
                while (i + count < size && array[i] == array[i + count])
                    count++;
                for (int j = 0; j < count; j++)
                    array[i + j] += 1;
                i = i + count - 1;
            }
        }
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }
    public static void main17(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < size; i++) {
            int j = i;
            while (array[j] < array[j - 1]) {

                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
                if (j == 0)
                    break;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        }





    public static void main16(String[] args) {
        List<Integer> l = new ArrayList<Integer>();

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(20);

            System.out.print(array[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - 1 - i; j++)
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }


            for (int z = 0; z < size; z++) {
                System.out.print(array[z] + " ");
            }
            System.out.println();
        }
    }




    public static void main15(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[]array  = new  int[size];
        for ( int i=0;i<array.length;i++){
            array[i] = random.nextInt(50);
             System.out.print(array[i] + "\t");
        }
        System.out.println();
        int temp;
        for ( int i =0;i<array.length;i++) {
            int minZnach = array[i];
            int indexMin = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < minZnach) {
                    minZnach = array[j];
                    indexMin = j;
                }
            }

            if (i != indexMin) {
                temp = array[i];
                array[i] = array[indexMin];
                array[indexMin] = temp;

                System.out.print("на круге №" + i+ "| " + array[i] + "<=>" + array[indexMin]);
                System.out.println();

            }
        }
        System.out.println();
            for (int i =0;i<array.length;i++){
                System.out.print(array[i] + "\t");

        }
    }







   //всатвками
    public static void main14(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(25);
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 1; i < size; i++) {
            int j = i;
            while (array[j] < array[j - 1]) {
                int temp = array[j - 1];
                array[j - 1] = array[j];
                array[j] = temp;
                j--;
            }
        }

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

    }


    public static void main13(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int size =1, da = 1;

        while (size % 2 != 0) {
            System.out.println("Введите четное число");
            size = scanner.nextInt();
        }
        int [] array = new int[size];
        for (int i=0;i<size;i++){
            array[i] = -5 + random.nextInt(11);
            System.out.print(array[i] + "\t ");
        }
        int summP = 0, summL = 0;
        for (int i = 0; i < array.length; i++) {
            if (i < array.length / 2)
                summL = summL + Math.abs(array[i]);
            else summP = summP + Math.abs(array[i]);
        }
            if (summL > summP)
                System.out.println("Левая сторона массива> правой" + " " + summL + ">" + summP);
            if (summL < summP)
                System.out.println("Правая сторона массива>левой" + " " + summL + "<" + summP);
            if (summL==summP)
                System.out.println("Они равны!!!!");

        }






    public static void main12(String[] args) {

        int[] array = new int[13];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
            System.out.print(array[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < array.length / 2; i++) {
            System.out.println(i + "<->" + (array.length - 1 - i));
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();




    }

















    public static void main11(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int x;
        int summL = 0;
        int summR = 0;
        do {
            System.out.println("Введите четное положительное число");
            x = scanner.nextInt();
            if (x % 2 != 0 || x < 1)
                System.out.println("Введите верное число");
        } while (x % 2 != 0 || x < 1);

        int arr[] = new int[x];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -5 + random.nextInt(11);
            System.out.print(arr[i] + " ");

            if (i <= arr.length / 2 - 1) {
                summL += Math.abs(arr[i]);}
            else{
                summR += Math.abs(arr[i]);
            }
                if (i == arr.length-1){
                if (summL > summR){
                    System.out.println();
                    System.out.println("Сумма левой половины массива больше правой и =" + " " + summL);}
                else{
                    System.out.println();
                    System.out.println("Сумма правой половины массива больше левой и =" + " " + summR);}
                if (summL == summR){
                    System.out.println();
                    System.out.println("======");}
            }
        }
    }






    public static void main10(String[] args) {
        Random random = new Random();
        int arr [] = new  int[11];
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        for (int i = 0;i<arr.length;i++){
            arr [i] = -1 + random.nextInt(3);
            System.out.print(arr[i] + "\t");

        if (arr[i]<0)aCount++;
        if (arr[i]==0) bCount++;
        if (arr[i]>0) cCount ++;
        if (i== arr.length-1) {
            if (aCount > bCount && aCount > cCount) {
                System.out.println();
                System.out.println("Чаще всего встречается -1" + " " + aCount + " " + "раз");
            }
            if (bCount > aCount && bCount > cCount){
                System.out.println();
            System.out.println("Чаще всего встерчается 0" + "" + bCount + " " + "раз");
            }

            if (cCount > aCount && cCount > bCount) {
                System.out.println();
                System.out.println("Чаще всего встерчается 1" + " " + cCount + " " + "раз");
            }
        }
        }



    }




    public static void main9(String[] args) {
        Random random = new Random();
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + random.nextInt(10);
            System.out.print(a[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            b[i] = 1 + random.nextInt(10);
            System.out.print(b[i] + "\t");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            c[i] = 1 + random.nextInt(10);
            System.out.print(c[i] + "\t");
        }
        System.out.println();
        System.out.println("******************************************");

        for (int i =0;i<a.length;i++){
            if(c[i]== a[i]/b[i])
                System.out.print(c[i] + "\t");
            else
                System.out.print("O" + "\t");
        }



    }














    public static void main8(String[] args) {
        Random random = new Random();
        int arr[] = new int[12];
        int max = arr[0];
        int maxInex = 0;
        for (int i = 0;i<arr.length;i++) {
            arr[i] = -15 + random.nextInt(31);
            System.out.print(arr[i] + "\t");
        }
        System.out.println();

            for (int i = 0;i<arr.length;i++) {

            if (arr[i] > max) {
                max = arr[i];
                maxInex = i;
            }
        }
        System.out.println("Макс "+ max + " "+ "Индекс=" + maxInex);

    }
















    public static void main7(String[] args) {
        int arr[] = new int[20];
        for (int i = 0; i < arr.length; i++) {
            if (i == 0||i == 1);
                arr[i] = 1;
            if (i > 1)
                arr[i] = arr[i - 2] + arr[i - 1];
            System.out.print(arr[i] + " ");
        }
    }




    public static void main6(String[] args) {
        Random random = new Random();
        int arr[] = new int[4];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 10 + random.nextInt(90);
            System.out.print(arr[i] + " ");
        }
        int max = arr[0];
       int count = 0 ;

       for ( int i =0;i<arr.length;i++)
            if (max < arr[i]) {
                max = arr[i];
               count = count +1;
               }

        if (count == arr.length - 1)
            System.out.println("++++");
        else
            System.out.println("не нарастает");

    }




    public static void main5(String[] args) {
        Random random = new Random();
        int arr[] = new int[2];
        int bArr[] = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(4);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] =  random.nextInt(4);
            System.out.print(bArr[i] + " ");
        }
        System.out.println();
        int arrA = 0;
        int arrB = 0;

        for (int i = 0; i < arr.length; i++) {
            arrA = arrA + arr[i];
            arrB = arrB + bArr[i];

        }
        arrA = arrA / arr.length;
        arrB = arrB / bArr.length;
        if (arrA > arrB)
            System.out.println("1>2 массива" + " "  +arrA + ">" + arrB );
        else if (arrA < arrB)
            System.out.println("2>1 массива" + " "+ arrB + ">" + arrA);
        else
            System.out.println("=");
    }



















    public static void main4(String[] args) {
      Random random = new Random();
        int arr[] = new  int[8];
        for (int i = 0;i< arr.length;i++){
            arr[i] = 1+random.nextInt(10);
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        for (int i = 0;i<arr.length;i++) {
            if (i % 2 != 0)
                arr[i] = 0;
            System.out.print(arr[i] + " ");
        }
    }

    public static void main3(String[] args) {
        Random random = new Random();
        int []arr = new int[15];
        for (int i  = 0;i<arr.length;i++){
            arr[i] =1+ random.nextInt(10);
            System.out.print(arr[i]);

        }
        System.out.println();
        int chet = 0;
        int count = 0;
        for ( int i = 0;i<arr.length;i++) {
            if (arr[i] % 2 == 0) {
                count = count + 1;
                System.out.print(arr[i]);

            }
        }
        System.out.println();
        System.out.println("Четные" + count );




    }











    public static void main2(String[] args) {
        Random random = new Random();
        int[] a = new int[10];

        for (int i = 0; i < a.length; i++) {
            a[i] = 20 + random.nextInt(81);
            System.out.print(a[i] + " ");
        }
        System.out.println();

        for (int i = 0; i < a.length; i += 2) {
            int temp = a[i];
            a[i] = a[i + 1];
            a[i + 1] = temp;
        }

        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

    }
        public static void main1(String[] args) {

        Random random = new Random();
        int[] a = new int[15];
        int chet = 0;
        int nChet = 0;
        int sumChet = 0;
        int sumNchet = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(10);
            System.out.print(a[i] + " ");


            if (a[i] % 2 == 0) {
                chet = chet + 1;
                sumChet = sumChet + a[i];
            } else {
                nChet = nChet + 1;
                sumNchet = sumNchet + a[i];
            }

        }
        System.out.println();
        System.out.println("Коллич четных в массиве =" + chet + " " + "И их сумма=" + " " + sumChet);
        System.out.println("Коллич нечетных в массиве =" + nChet + " " + "И их сумма=" + " " + sumNchet);
    }
}