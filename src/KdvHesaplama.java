import java.util.Scanner;

public class KdvHesaplama {
    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Turarı girin : ");
        double tutar=input.nextDouble();
        double kdvOrani=0.18;
        double kdvliTutar= tutar+(tutar*kdvOrani);
        System.out.println(kdvliTutar);

    }
}
