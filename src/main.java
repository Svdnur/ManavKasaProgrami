import java.util.Scanner;

public class main {
    public static void main(String[] args){

        // armut = 2.14, elma = 3.67, domates =1.11, muz = 0.95, patlican= 5.0


        Scanner input = new Scanner(System.in);

        double armut,elma,domates,muz,patlican,total;



        System.out.println("Kaç kilo armut aldınız ?");
        armut = input.nextDouble();

        System.out.println("Kaç kilo elma aldınız ?");
        elma = input.nextDouble();

        System.out.println("Kaç kilo domates aldınız ?");
        domates = input.nextDouble();

        System.out.println("Kaç kilo muz aldınız ?");
        muz = input.nextDouble();

        System.out.println("Kaç kilo patlıcan aldınız?");
        patlican = input.nextDouble();

        total = ( armut * 2.14) + ( elma * 3.67) + (domates * 1.11) +(muz * 0.95) +(patlican *5.0);

        System.out.println("Toplam tutar:" + total);
    }
}
