import java.util.Scanner;

/**
 * Created by ARTos on 07.11.2016.
 */
public class cycle {
    public static void main(String[] args) {
        int counTicket = 0;
        int count = 0;
        for (int i = 0; i <= 50000; i++) {
            while (i!=0&&i>0) {
                if (i % 10 == 2) {
                    count = count + 1;
                    i = i / 10;
                }
            }
            if (count >= 1)
                counTicket = counTicket + 1;
            count = 0;
        }
        System.out.println(counTicket);
    }


public static void main13(String[]args) {
        int ticket = 1;
        for (int i = 1010; i <= 100000; i++) {
            int i1 = i / 100000 % 10;
            int i2 = i / 10000 % 10;
            int i3 = i / 1000 % 10;
            int i4 = i / 100 % 10;
            int i5 = i / 10 % 10;
            int i6 = i % 10;
    if ((i1+ i2 + i3)==(i4+i5+i6)){
        System.out.println(ticket +")" + i1+i2+i3+i4+i5+i6);
        ticket = ticket +1;
            }
        }

    }
    public static void main12(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int summ =0;
        int c;
        c = scanner.nextInt();
        System.out.print( "Сумма чисел числа" + " " + c);
        while (c!=0){
            summ = summ + c%10;
            c=c/10;
                }
        System.out.println("=" + summ);
    }
    public static void main11(String[] args) {
        int a =1,b=1,c=0;
        System.out.print( a+ "\t" + b+ "\t");
        for (int i=3;i<=20;i++){
            c = a+b;
            a=b;
            b=c;
            System.out.print(c +"\t");
        }
    }




    public static void main8(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x;
        x = scanner.nextInt();
        for ( int i=1;i<=x;i++){
            if (x%i==0)
                System.out.println(i);
        }
    }


    public static void main7(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int index;
        int res =1;
        index = scanner.nextInt();
        for ( int i =1;i<=index;i++){
            res = res*i;
        }
        System.out.println(index + "!=" + res);
    }

    public static void main5(String[] args) {
        for (int a = 2,i =1;i>0;a=2*a-1,i++){
            if (a>=10000)
                break;

            System.out.print(a + "\t");

        }

    }


    public static void main4(String[] args) {
        int size = 20;
        int count = 0;
        for (int i = 2; i >0; i = i * 2) {
            System.out.println((count+1) + ")" + i+ "\t");
            count = count + 1;
            if (count == size){
                break;
            }
        }

    }

    public static void main3(String[] args) {
        for ( int i=90;i>=0;i=i-5){
            System.out.print(i +"\t");
        }
    }


    public static void main2(String[] args) {
        int size = 55;
        for (int i =1;i<=size;i=i+2){
            System.out.print(i+"\t");
        }
    }



    public static void main1(String[] args) {
       int count =0;
        int numeralCount =0;
        for ( int i = 1000;i<9999;i = i+3){
            System.out.print(i +"\t");
            count = count+1;
            numeralCount = numeralCount+1;
            if (count ==30){
                System.out.println();
                count = 0;
            }
        }
        System.out.println(numeralCount + "=Value");
    }
}
