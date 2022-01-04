import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int acilis = 10;
    double km1 = 2.20;
        Scanner scn = new Scanner(System.in);
        System.out.print("Taksi ile kaç km. yolculuk yaptınız? : ");
        double alinanKm = scn.nextDouble();

        double fiyat = acilis + (alinanKm*km1);

        if(fiyat <20.0){
            System.out.println("Ödeyeceğiniz fiyat : 20.0 Tl");
        }
        else{
            System.out.println("Ödeyeceğiniz fiyat : "+ fiyat);
        }
    }
}
