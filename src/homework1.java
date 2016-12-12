import com.sun.deploy.nativesandbox.IntegrityProcess;
import com.sun.deploy.panel.ITreeNode;

import java.util.Random;
import java.util.Scanner;
public class homework1 {
    public static void main(String[] args) {


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




}