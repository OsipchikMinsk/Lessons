import java.util.Scanner;
public class Homework2 {

    /*кирпич (x*y*z)
 * и круглое отверстие диаметром d
 * войдет или нет?*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну кирпича"); // h
        int h = scanner.nextInt();
        System.out.println("Введите ширину кирпича"); // х
        int x = scanner.nextInt();
        System.out.println("Введите высоту кирпича"); // l
        int l = scanner.nextInt();
        System.out.println("Введите диаметр отверстия"); // d
        int d = scanner.nextInt();
        if ((x * x) + (h * h) <= (d * d) || (x * x) + (l * l) <= (d * d) || (h * h) + (l * l) <= (d * d))
            System.out.println("Кирпич входит в данное отверстие");
        else
            System.out.println("Кирпич не входит в данное отвертие");
    }



   /* Скорость и гаишник
* 1) разрешенная скорость (v1)
* 2) реальная скорость     (v2)
* в зависимости от силы превышения назначить наказания
* 0-10 можно
* 10-20 - 1 б.в. без записи
* 20-30 - 2 б.в. с записью
* 30-...3 б.в.*/
   public static void main2(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите разрешенную скорость");
       int v1 = scanner.nextInt();
       System.out.println("Введите скорость с котрой Вы двигались");
       int v2 = scanner.nextInt();
       if (v2 <= v1 && (v1 - v2) >= 0)
           System.out.println("Вы двигалаись без превышения");
       else if (0<(v2-v1) && (v2-v1)<=10)
           System.out.println("Можно" + " " + ", но Вы привысили на" + " " + (v2 - v1) + " км" );
       else if (10 < (v2 - v1) && (v2 - v1) <= 20)
           System.out.println("Штраф 1 б.в. без записи,  Вы привысили на" + "  " + (v2 - v1) + " км"  );
       else if (20 < (v2 - v1) && (v2 - v1) <= 30)
           System.out.println("Штраф 2 б.в. c записи,  Вы привысили на" + "  " + (v2 - v1) + " км"  );
       else if ((v2-v1)>30)
           System.out.println( "Штраф 3 б.в. c записи,  Вы привысили на" + "  " + (v2 - v1) + " км"  );

   }







   /* У покупателя есть сумма Х
 * он покупает фрукты массой m1 по цене p1 за кг
 * он покупает овощи массой m2 по цене p2 за кг
 * он покупает ягоды массой m3 по цене p3 за кг
 * вопрос хватит или нет? */
   public static void main3(String[] args) {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Введите сумму денег");
       int x = scanner.nextInt();
       System.out.println("Введите массу фруктов");
       int m1 = scanner.nextInt();
       System.out.println("Введите стоимость фруктов за 1 кг");
       int p1 = scanner.nextInt();
       System.out.println("Введите массу овощей");
       int m2 = scanner.nextInt();
       System.out.println("Введите стоимость овощей за 1 кг");
       int p2 = scanner.nextInt();
       System.out.println("Введите массу ягод");
       int m3 = scanner.nextInt();
       System.out.println("Введите стоимость ягод за 1 кг");
       int p3 = scanner.nextInt();
       if (x<(m1*p1) + (m2*p2) + (m3*p3))
           System.out.println("Недостаточно следств!!!");
       else {
           System.out.println("Вы успешно приобрели указанные продукты");
           System.out.println( "Сумма покупки =" + " " +(m1*p1 + m2*p2 + m3*p3) );
       }

   }



}
