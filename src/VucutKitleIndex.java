import java.util.Scanner;

public class VucutKitleIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double boy,kilo,vki;
        System.out.println("Lütfen boyunuzu girin :");
        boy=input.nextDouble();
        System.out.println("Lütfen kilonuzu girin :");
        kilo=input.nextDouble();
        vki=kilo/(boy*boy);



        System.out.println("Vücut kitle indexiniz  :" + vki);




    }
}
