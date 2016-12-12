/*1) принимает инт - размер массива, заполняет его случ. числами, и возвращает этот массив
        2) принимает инт-размер возвращает  массив заполенныей по порядку
        3) принимает массив - возразает сумму макс и мин значения
        4) принимает Х У - ничего не возвращает - рисует прямоугольник размером Х на У

*/
public class Function {
    public  static void printArray(int [] array){
        for ( int i =0;i< array.length; i++)
            System.out.print(array[i] + "\t");
        System.out.println();
    }
    public static int [] arraySize (int size){
        int [] array = new int[size];
        for (int i =0;i<size;i++)
            array[i] = (int) (Math.random()*100);
        return  array;
    }
    public static int[] arraySort (int size){
        int[] array = new int[size];
        for (int i =0;i<size;i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + "\t");
        }
        System.out.println();
        for (int i = array.length-1; i >= 2; i--) {
            boolean sort = false;
            for (int j = 0; j < i; j++) {
                if (array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] =array[j+1];
                    array[j+1] = temp;
                    sort = false;
                }
            }
        if (sort)
            break;
        }
        return  array;
    }
    public  static void printLine (){
        System.out.println("======================================");

    }
    public static int summMaxMin(int[] arrayX){
        int min = arrayX[0], max = arrayX[0], summ =0;
        for (int i  = 0;i<arrayX.length;i++){
            if (arrayX[i]< min)
                min = arrayX[i];
            if (arrayX[i]>max)
                max = arrayX[i];
        }
        summ = max+min;
        System.out.println("мин =" + min + "\t" + "макс=" + max + "\t" + min + "+" + max  + "=" +summ);//для самопроверки
        return summ;
    }
    public static void longSquer (int x, int y){
        for (int i = 0;i<y;i++){
            for (int j=0;j<x;j++)
                System.out.print("*");
        System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int [] a = arraySize(10);
        printArray(a);
        printLine();
        System.out.println("Задача 2");
        int [] c = arraySort(5);
        printArray(c);
        printLine();
        System.out.println("Задача 3");
        int [] arrayX = {10,20,30,40,50,99,98,10,2};
        printArray(arrayX);
        System.out.println(summMaxMin(arrayX));
        printLine();
        System.out.println("Задача 4");
        longSquer(6,4);
        printLine();
            }

}
