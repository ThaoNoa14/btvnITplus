import java.util.Scanner;
public class Bai7 {
    public static void main(String[] args){
        Scanner lx = new Scanner(System.in);
        System.out.print("Nhap so tien ban muon gui (nghin dong): ");
        int gui = lx.nextInt();
        System.out.print("Nhap lai xuat(%): ");
        int lai = lx.nextInt();
        System.out.print("Nhap so thang gui: ");
        int thang = lx.nextInt();
        for (int i = 1; i<=thang;i++){
            gui=gui+(gui*lai/100);
        }
        System.out.print("So tien la: "+gui);
    }
}
