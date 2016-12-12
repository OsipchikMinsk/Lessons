import java.util.Random;

/**
 *
 * 1) Дан целочисленный массив A размера 10. Вывести порядковый номер последнего из тех его элементов AK, которые удовлетворяют двойному неравенству A[0] < A[K] < A[10].
 Если таких элементов нет, то вывести 0.

 2) Дан массив размера N и целые числа K и L (1 ≤ K ≤ L ≤ N). Найти сумму элементов массива с номерами от K до L включительно.

 3) Дан массив размера N и целые числа K и L (1 < K ≤ L ≤ N). Найти сумму всех элементов массива, кроме элементов с номерами от K до L включительно.

 * Created by ARTos on 22.11.2016.
 */

public class HomeworkFour {
    public static void main(String[] args) {
        task1();
    }
    public static void task1 () {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        int k, count = 0;
        //int k;
        for (int i = 0; i < array.length; i++)
            if (array[0] < array[i] && array[i] < array[9]) {
                k = i;
                count++;
                //System.out.println("Индекс=" + k + "\t");//для самопроверки
                if (count > 0)
                    System.out.println(k);
                else
                    System.out.println(0);

            }

    }
}
