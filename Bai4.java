import java.util.Scanner;
public class Bai4 {
    public static void main(String[] args)
    {
        Scanner gt = new Scanner(System.in);
        System.out.print("Nhap so n muon tinh giai thua: ");
        int n = gt.nextInt();
        int giaithua=1;
        for (int i = n; i > 0; i--) {
            giaithua = giaithua * i;
        }
        System.out.println("Giai thua cua n la: " + giaithua);
    }
}
