import java.util.Scanner;

public class RataNilai07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int j, i, totalNilai, nilaiMhs;
        double rataNilai;
        for (j = 1; j <= 5; i++) {
            i = 1;
            while (i <= 5) {
                System.out.println("Input Nilai Mahasiswa ke-" + i);
                totalNilai = 0;
                for (j = 1; j <= 5; j++) {
                    System.out.print("Nilai  ke-" + j + " = ");
                    nilaiMhs = sc.nextInt();
                    totalNilai+=nilaiMhs;
                }
                rataNilai = totalNilai/5;
                i++;
                System.out.println("Rata-rata Nilai Mahasiswa ke-" + i + " adalah " + rataNilai);
            }
            
        }
    }
}