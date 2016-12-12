import java.util.ArrayList;
import java.util.Scanner;

public class homework3 {
    public static int getMax(int a, int b){
        return a > b ? a : b;
    }

    public static int getMin(int a, int b){
        return a < b ? a : b;
    }

    public static void main(String[] args){


        ArrayList<Integer> ran = new ArrayList<>();
        ran.add(6);ran.add(4);ran.add(2);ran.add(1);ran.add(3);ran.add(5);

        System.out.println("Исходный массив:");
        for (int i = 0; i < ran.size(); i++){
            System.out.print(" "+ ran.get(i) );
        }

        System.out.println();
        System.out.println("_________________________________________");


        System.out.println("////// :# 1");

        for (int i = 0; i < ran.size(); i++){
            if (ran.get(i) % 2 > 0){
                System.out.println("Первый нечетный слева: " + ran.get(i));
                break;
            }
        }
        for (int i = 0; i < ran.size(); i++){
            if (ran.get(i) % 2 == 0){
                System.out.println("Первый четный справа: " + ran.get(i));
                break;
            }
        }


        System.out.println("_________________________________________");



        System.out.println("////// :# 2, 3");
        int max = ran.get(0);
        int b = 0;
        for (int i = 0 ; i < ran.size()/2; i++){
            b = ran.get(i);
            max = getMax(max, b);
        }
        int min = ran.get(0);
        int c = 0;
        for (int i = ran.size()/2 ; i < ran.size(); i++){
            c = ran.get(i);
            min = getMin(min, c);
        }
        System.out.println("Максимальное четное = " + max);
        System.out.println("Минимальное Нечетное = " + min);
        System.out.println("_________________________________________");


        System.out.println("////// :# 4   провернуть массив на n шагов");

        int n = 4;
        for (int k = 0; k < n; k++){
            ran.add(0, ran.get(ran.size()-1));
            ran.remove(ran.size()-1);
        }

        for (int i = 0; i < ran.size(); i++){
            System.out.print(" "+ ran.get(i) );
        }

        System.out.println();
        System.out.println("_________________________________________");


        System.out.println("////// :# 5 поменяйте местами максимальный и минимальный элемент местами");

        int maxIndex = 0;
        for (int i = 1; i < ran.size(); i++){
            maxIndex = (ran.get(maxIndex) > ran.get(i)) ? maxIndex : i;
        }

        int minIndex = 0;
        for (int i = 1; i < ran.size(); i++){
            minIndex = (ran.get(minIndex) < ran.get(i) ? minIndex : i);
        }
        System.out.println(minIndex);
        System.out.println(maxIndex);

        ran.add(minIndex, ran.get(maxIndex));
        ran.remove(maxIndex + 1);
        ran.add(maxIndex + 1, ran.get(minIndex+1));
        ran.remove(minIndex + 1);

        for (int i = 0; i < ran.size(); i++){
            System.out.print(" "+ ran.get(i) );
        }

        System.out.println();
        System.out.println("_________________________________________");

    }

}






