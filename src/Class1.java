/**
 * Created by ARTos on 22.12.2016.
 */
public class Class1 {
    public static class Cognac{
        public int age;
        public String name;
        public double price;
        public String aromat;
    }
    public static void showCognac (int number, Cognac cognac){
        System.out.println("Коньяк №\t" + number);
        System.out.println("Возраст \t" + cognac.age);
        System.out.println("Цена\t" + cognac.price);
        System.out.println("Название коньяк\t" + cognac.name);
        System.out.println("Аромат\t" + cognac.aromat);
        System.out.println();


    }
    public static Cognac [] cognacsSortByAge (Cognac[] cognacs){
        for (int i =0;i<cognacs.length;i++)
            for (int j =0;j<cognacs.length-1;j++)
            if (cognacs[j].age<cognacs[j+1].age){//делаю сортиворвку что бы старый был первым
                Cognac temp = cognacs[j];
                cognacs[j] = cognacs[j+1];
                cognacs[j+1] = temp;
            }
        return cognacs;
    }
    public static Cognac searchByPrice (Cognac[] cognacs, double price){
        for (int i = 0; i < cognacs.length; i++)
            if (cognacs[i].price == price)
                return cognacs[i];
        return null;

    }

    public static void main(String[] args) {
        Cognac c1 = new Cognac();
        c1.age = 5;
        c1.name = "Versal";
        c1.price = 20;
        c1.aromat = "in Belorashian Style(((";

        Cognac c2 = new Cognac();
        c2.age = 10;
        c2.name = "Martell";
        c2.price = 80;
        c2.aromat = "VSOP";

        Cognac c3 = new Cognac();
        c3.age = 15;
        c3.name = "Hennesy";
        c3.price = 200;
        c3.aromat = "XO";

        showCognac(1,c1);
        showCognac(2,c2);
        showCognac(3,c3);

        Cognac[] bar = new Cognac[3];
        bar [0] = c1;
        bar [1] = c2;
        bar [2] = c3;
        System.out.println("Сортировка возрасту ");
        System.out.println();
        bar = cognacsSortByAge(bar);
        for (int i =0;i<bar.length;i++)
            showCognac(i+1,bar[i]);
        System.out.println("Поиск по цене" +);
        System.out.println();
        Cognac bar200 = searchByPrice(bar,200);
        showCognac(1,bar200);



    }
}
