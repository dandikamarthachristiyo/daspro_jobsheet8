import java.util.Scanner;

public class Kotak07 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai N = ");
        int n = sc.nextInt();

        for(int k = 1; k <= n; k++){
            System.out.println();
            
            for (int i = 1; i <= n; i++) {
                if (k > 1 && k < n && i > 1 && i < n) {
                    System.out.print(" ");
                }else{
                    System.out.print(n);
                }
                System.out.print(" ");
            }
        }
    }
}