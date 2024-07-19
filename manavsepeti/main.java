import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlican = 7.00;

        System.out.print("Salatalik Kac Kilo: ");
        double salatalikKilo = scan.nextDouble();

        System.out.print("Elma Kac Kilo: ");
        double elmaKilo = scan.nextDouble();

        System.out.print("Kabak Kac Kilo: ");
        double kabakKilo = scan.nextDouble();

        System.out.print("Domates Kac Kilo: ");
        double domatesKilo = scan.nextDouble();

        System.out.print("Patlican Kac Kilo: ");
        double patlicanKilo = scan.nextDouble();

        double toplam = 0.0;
        toplam += (salatalik + salatalikKilo);
        toplam += (elma + elmaKilo);
        toplam += (kabak + kabakKilo);
        toplam += (domates + domatesKilo);
        toplam += (patlican + patlicanKilo);
        System.out.println("Toplam Tutar : " + toplam);
    }
}