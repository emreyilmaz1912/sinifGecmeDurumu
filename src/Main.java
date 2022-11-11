import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sınıf geçme durunumunuzu hesaplamak için notlarınızı giriniz!");
        int mat, fizik, turkce, kimya, muzik, min = 0, max = 100;
        Scanner inp = new Scanner(System.in);

        while (true) {
            System.out.print("Matematik Notunuz :");
            mat = inp.nextInt();
            System.out.print("Fizik Notunuz :");
            fizik = inp.nextInt();
            System.out.print("Türkçe Notunuz :");
            turkce = inp.nextInt();
            System.out.print("Kimya Notunuz :");
            kimya = inp.nextInt();
            System.out.print("Müzik Notunuz :");
            muzik = inp.nextInt();
            double matDeger, fizikDeger, turkceDeger, kimyaDeger, muzikDeger;
            if (mat >= min && mat <= max) {
                matDeger = mat;
            } else {
                matDeger = 0;}
            if (fizik >= min && fizik <= max) {
                fizikDeger = fizik;
            } else {
                fizikDeger = 0;}
            if (turkce >= min && turkce <= max) {
                turkceDeger = turkce;
            } else {
                turkceDeger = 0;}
            if (kimya >= min && kimya <= max) {kimyaDeger = kimya;

            } else {
                kimyaDeger = 0;}
            if (muzik >= min && muzik <= max) {
                muzikDeger = muzik;
            } else {
                muzikDeger = 0;}
            double avarage = ((matDeger) + (fizikDeger) + (turkceDeger) + (kimyaDeger) + (muzikDeger) ) / 5 ;
            if (avarage <= 55){
                System.out.println("Sınıfta Kaldınız!");
            }else {
                System.out.println("Tebrikler Sınıfı Geçtiniz!");
            }
            System.out.println("Notunuz :" + avarage);

        }
        }
    }