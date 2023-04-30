
import java.util.Random;
public class RandomClass {
    public static void main(String[] args) {
        Random rnd = new Random();
        int sayi;
        sayi = rnd.nextInt();
        System.out.println(sayi);

        int sayi1 = rnd.nextInt(5);
        int sayi2 = rnd.nextInt(5)+2;


        System.out.println(sayi1);
        System.out.println(sayi2);

        int sayi3 = 3*rnd.nextInt(5);
        System.out.println("sayi3 = " + sayi3);


        int max= 10;
        int min= 5;

        int sayi4 = rnd.nextInt(max);

        int sayi5 = rnd.nextInt(max+1);
        System.out.println("sayi4 = " + sayi4);
        System.out.println("sayi5 = " + sayi5);

        int sayi6 = rnd.nextInt(max+1)+min;
        System.out.println("sayi6 = " + sayi6);
        int sayi7 = rnd.nextInt(max+1-min)+min;
        System.out.println("sayi7 = " + sayi7);

    }
}

//denemeee