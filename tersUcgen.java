import java.util.Scanner;
public class tersUcgen {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Basamak Sayısını Giriniz : ");
        int n = inp.nextInt();

        for (int i = (n - 1); i > 0; i--) {

            for (int k = (n - i); k > 0; k--) {
                System.out.print(" ");
            }

            for (int j = (2 * i) - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
    }
}


