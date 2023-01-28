import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int sicaklik;
        System.out.print("Sıcaklık değerini giriniz: ");
        sicaklik= input.nextInt();
        if(sicaklik<5){
            System.out.println("Kayak Yapabilirsiniz");
        }
        else if(sicaklik<=25){
            if (sicaklik<=15){
                System.out.println("Sinemaya Gidebilirsiniz");
            }
            if(sicaklik>=10){
                System.out.println("Pikniğe Gidebilirsiniz");
            }
        }
        else{
            System.out.println("Yüzmeye Gidebilirsiniz");
        }

    }
}