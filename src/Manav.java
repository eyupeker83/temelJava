import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,kg,toplam,armutKg,elmaKg,domatesKg,muzKg,patlicanKg;

        armut=2.14;
        elma=3.67;
        domates=1.11;
        muz=0.95;
        patlican=5.00;

        Scanner input =new Scanner(System.in);


        System.out.println("Armut kaç kg :");
        armutKg=input.nextDouble();

        System.out.println("elma kaç kg :");
        elmaKg=input.nextDouble();
        System.out.println("domates kaç kg :");
        domatesKg=input.nextDouble();
        System.out.println("muz kaç kg :");
        muzKg=input.nextDouble();
        System.out.println("patlican kaç kg :");
        patlicanKg=input.nextDouble();

        toplam=(elma*elmaKg)+(armut*armutKg)+(domates*domatesKg)+(muz*muzKg)+(patlican*patlicanKg);

        System.out.println("Toplam :"+toplam);
    }
}
