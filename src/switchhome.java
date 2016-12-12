import java.util.Scanner;

/**массив 5 на 10

 Дети по номерам!!!
 все считаем от нуля

 Сделать программу с меню
 1) Добавить оценку ребенку по номеру (добавление оценки в массив)
 Спрашивает номер ребенка, спрашивает оценку
 (оценку ставим в первую нулевую ячейку)

 2) Показать оценки всех детей (кроме нулевых оценок) + показать среднюю по каждому
 3) Найти ученика с макс оценкой
 (если их несколько - то всех)
 показать его номер
 4) Найти ученика с макс средней оценкой
 5) Заменить оценку у ребенка. Поменять вторую оценку на новое значение
 спрашиваем номер ребенка, номер оценки, новое значение.
 6)очистить все оценки ребенка
 * Created by ARTos on 24.11.2016.
 */
public class switchhome {
    public static int [] [] array = new int[5][5];

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choose;
        do {
            System.out.println("1-5 Введите номер ребенка от 1 до 5");
            System.out.println("6) Вывод на экран оценок");
            System.out.println("7) Средний балл по ученикам");
            System.out.println("8) Максимальная оценка");
            System.out.println("9) Максимальная средняя оценка");
            System.out.println("10) Замена оценки ");
            System.out.println("11) Очистка оценок");
            System.out.println("12) Выход");
            choose = scanner.nextInt();
            switch (choose){
                case 1:
                    for (int i =0;i<array.length;i++){
                        System.out.println("Введите оценку");
                        array[0] [i] = scanner.nextInt();
                        }
                        break;
                case 2:
                    for (int i =0;i<array.length;i++){
                        System.out.println("Введите оценку");
                        array[1][i] = scanner.nextInt();
                    }
                    break;
                case 3:
                    for (int i = 0; i < array.length; i++) {
                        System.out.println("Введите оценку");
                        array[2][i] = scanner.nextInt();
                    }
                    break;
                case 4:
                    for (int i =0;i<array.length;i++){
                        System.out.println("Введите оценку");
                        array[3] [i] = scanner.nextInt();
                    }
                    break;
                case 5:
                    for (int i =0;i<array.length;i++){
                        System.out.println("Введите оценку");
                        array[4] [i] = scanner.nextInt();
                    }
                    break;
                case 6:
                    preentArray();
                    break;
                case 7:
                    summMeedle();
                    break;
                case 8:
                    maxValue();
                    break;
                case 9:
                    maxMeedlValue();
                    break;
                case 10:
                    int x,y,z;
                    System.out.println("Введите номер учениика от 1 до 5");
                    x = scanner.nextInt();
                    x = x-1;
                    System.out.println("Введиет номер оценки от 1 до 5");
                    y = scanner.nextInt();
                    y = y-1;
                    System.out.println("Введите оценку");
                    z = scanner.nextInt();
                    for (int i = 0;i<array.length;i++){
                        for (int j  = 0;j<array[0].length;j++){
                            array[x][y] = z;
                        System.out.print(array [i] [j] + "\t");
                        }
                        System.out.println();
                     }
                     break;
                case 11:
                    System.out.println("Введите номер учениика от 1 до 5");
                    x = scanner.nextInt();
                    x = x-1;
                    for (int i = 0;i<array.length;i++){
                        for (int j  = 0;j<array[0].length;j++){
                            array[x][j] = 0;
                            System.out.print(array [i] [j] + "\t");
                        }
                        System.out.println();
                    }
                    break;

                case 12:
                    System.out.println("Пока!!!!");
                    break;
                default:
                    System.out.println("!!!ERROR!!!");
            }
            } while (choose != 12);

    }

    public static void preentArray() {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++)
                if (array[i][j] > 0)
                    System.out.print(array[i][j] + "\t");
                else
                    System.out.print(" " + "\t");
            System.out.println();
        }

    }

    public static void summMeedle() {
        int summ = 0;
        int count = 1;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                summ = summ + array[i][j];
                count++;
            }
            System.out.println("Средний балл" + (i + 1) + "-го ученика =" + summ / count);
            count = 1;
            summ = 0;
        }
    }

    public static void maxValue() {
        int max = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] == max)
                    System.out.println("Максимальная оценка" + "" + array[i][j] + " " + "у ученика под номером" + "" + (i + 1));
            }
        }
    }
    public static void maxMeedlValue (){
        int summ =0;
        int count = 1;
        int max = 0;
        int k =0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                summ = summ + array[i][j];
                count++;
            }
            if (summ/count>max) {
                max = summ / count;
                k = i;
            }
            summ =0;
            count =1;
        }
        System.out.println("Максимальный средний балл у ученика №" + " " + k + " и балл =" + max);
    }

}