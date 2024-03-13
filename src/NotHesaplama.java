import java.util.Scanner;

public class NotHesaplama {
    public static void main(String[] args) {

        int mat,fzk,kimya,turkce,tarih,muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik dersi için sınav sonucunu girin:");
        mat=input.nextInt();
        System.out.print("fizik dersi için sınav sonucunu girin:");
        fzk=input.nextInt();
        System.out.print("kimya dersi için sınav sonucunu girin:");
        kimya=input.nextInt();
        System.out.print("turkce dersi için sınav sonucunu girin:");
        turkce=input.nextInt();
        System.out.print("tarih dersi için sınav sonucunu girin:");
        tarih=input.nextInt();
        System.out.print("muzik dersi için sınav sonucunu girin:");
        muzik=input.nextInt();

        double ort=(mat+fzk+kimya+turkce+tarih+muzik)/6;

        System.out.println("ortalamanız : "+ ort);

    }
}
