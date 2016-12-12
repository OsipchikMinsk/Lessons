import java.util.Random;

/**
 * Created by ARTos on 01.12.2016.
 */
public class gamelife {
    public static final int SIZE_X = 150;
    public static final int SIZE_Y = 35;
    public static final char EMPTY = ' ';
    public static final char FULL = '@';
    public static final char LIFE_ONE_TIME ='M';

    public static char[][] pole = new char[SIZE_Y][SIZE_X];
    public static char[][] poleD = new char[SIZE_Y][SIZE_X];
    public static char[][] poleA = new char[SIZE_Y][SIZE_X];
    public static void oneTimeLife (){
        for (int i =0;i<SIZE_Y;i++) {
            for (int j = 0; j < SIZE_X; j++) {
                if (pole[i][j] == FULL && pole[i][j] == LIFE_ONE_TIME) {
                    pole[i][j] = poleA[i][j];
                    poleA[i][j] = LIFE_ONE_TIME;
                }
            }
        }
        for (int i =0;i<SIZE_Y;i++) {
            for (int j = 0; j < SIZE_X; j++)
                System.out.print(poleA[i][j]);
            System.out.println();
        }
    }



    public static int isNeighbor(int i, int j) {
        if (i < 0 || i >= SIZE_Y)
            return 0;
        if (j < 0 || j >= SIZE_X)
            return 0;
        if (pole[i][j] == EMPTY)
            return 0;
        return 1;
    }

    public static void makeLoop() {
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++)
                poleD[i][j] = EMPTY;

        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++) {
                int neighborAliveCount = 0;
                neighborAliveCount += isNeighbor(i + 1, j + 1);
                neighborAliveCount += isNeighbor(i + 1, j);
                neighborAliveCount += isNeighbor(i + 1, j - 1);
                neighborAliveCount += isNeighbor(i, j - 1);
                neighborAliveCount += isNeighbor(i, j + 1);
                neighborAliveCount += isNeighbor(i - 1, j + 1);
                neighborAliveCount += isNeighbor(i - 1, j);
                neighborAliveCount += isNeighbor(i - 1, j - 1);
                if (pole[i][j] == EMPTY && neighborAliveCount == 3)
                    poleD[i][j] = FULL;
                if (pole[i][j] == FULL &&
                        (neighborAliveCount == 2 || neighborAliveCount == 3))
                    poleD[i][j] = FULL;
            }
        char[][] temp = poleD;
        poleD = pole;
        pole = temp;


    }

    public static void show() {
        //делаем поле пустым
        for (int i = 0; i < SIZE_Y; i++) {
            for (int j = 0; j < SIZE_X; j++)
                System.out.print(pole[i][j]);
            System.out.println();
        }
    }


    public static void main(String[] args) throws InterruptedException {
        Random random = new Random();
        for (int i = 0; i < SIZE_Y; i++)
            for (int j = 0; j < SIZE_X; j++)
                pole[i][j] = random.nextInt(10) == 0 ? FULL : EMPTY;

        pole[5][5 + 110] = FULL;
        pole[6][4 + 110] = FULL;
        pole[7][4 + 110] = FULL;
        pole[7][5 + 110] = FULL;
        pole[7][6 + 110] = FULL;




        while (true) {
            show();
            makeLoop();
            //oneTimeLife();
            Thread.sleep(200);
        }

    }
}
