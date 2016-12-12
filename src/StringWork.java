/*1) найти максимальное цифру в строке
 2) найти кол-во числе в строке
 fasdf324agfdsg


 3) найти сумму ЧИСЕЛ в строке
 afsdsa34gdf22e3dsafasdf


 4) найти максимальное ЧИСЛО в строке.
 */
public class StringWork {

    public static void main(String[] args) {
        String w = "12afsdsa34gdf22e3dsafasdf";
        int summ = 0;
        int count = 0;
        int max =0;
        for (int i = 0; i < w.length(); i++)
            if (w.charAt(i) == '0' || w.charAt(i) == '1' || w.charAt(i) == '2' || w.charAt(i) == '3' || w.charAt(i) == '4' || w.charAt(i) == '5' || w.charAt(i) == '6' || w.charAt(i) == '7' || w.charAt(i) == '8' || w.charAt(i) == '9')
                count += 1;

        System.out.println("Колличество циф в строке" + " " +w+"= " +count);

        for (int i = 0; i < w.length(); i++) {
            summ += check(w.charAt(i));
        }
        System.out.println("Сумма чисел в строке\t" + w +"="+ summ);
    }

    public static int check(char c) {
        if ('0' <= c && c <= '9')
            return c - '0';
        return 0;
    }
}