import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Sayı: ");
        int sayi = in.nextInt();
        int x = sayi-1, total=0;
        while (x>0){
            if (sayi%x==0){
                total+=x;
            }
            x--;
        }
        if (total==sayi){
            System.out.println(sayi+" sayısı bir Mükemmel sayıdır.");
        } else{
            System.out.println(sayi+" sayısı bir Mükemmel sayı değildir.");
        }
    }
}
