import java.util.Scanner;

public class UcgeninHipotenusunuBulanPrg {

    //Dik ücgenin hipotenüsünü bulan program
    // a2+b2=c2

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int a,b;
        double c;
        System.out.print("1. kenarı girin :");
        a=input.nextInt();

        System.out.print("2. kenarı girin :");
        b=input.nextInt();
        c=Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs :"+c);

    }
}
