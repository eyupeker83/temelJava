import java.util.Scanner;

public class DaireninAlani {
    public static void main(String[] args) {
        double pi=3.14;
        int r;
        double cevre,alan;
        Scanner input=new Scanner(System.in);
        System.out.print("ücgenin yarıçapını girin  : ");
        r= input.nextInt();

        cevre= 2*pi*r;
        alan=pi*r*r;

        System.out.print("çevresi : "+cevre);
        System.out.print("alanı : "+alan);
    }
}
