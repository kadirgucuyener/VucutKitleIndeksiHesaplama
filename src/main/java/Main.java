import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float boy, kilo;
        double indeks;


        Scanner girdi = new Scanner(System.in);
        System.out.print("Lütfen Boyunuzu (metre cinsinden) Giriniz : ");
        boy = girdi.nextFloat();

        System.out.print("Lütfen Kilonuzu Giriniz : ");
        kilo = girdi.nextFloat();

        indeks = kilo / (boy*boy);
        System.out.println("Vücut Kitle İndeksiniz  : " + indeks);

    }
}
