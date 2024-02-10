import java.util.Scanner;
import java.util.Random;
public class Bai9 {
    public static void main(String[] args){
        int thang =0;
        Scanner game = new Scanner(System.in);
        System.out.print("Nhap so dau: ");
        int a = game.nextInt();
        a=a+1;
        System.out.print("Nhap so cuoi: ");
        int b = game.nextInt();
        b=b-1;
        Random so = new Random();
        int win = so.nextInt((b-a)+1)+a;
        System.out.print(win);
        for(int i=1;i<=3;i++){
            System.out.print("Ban doan so: ");
            int doan = game.nextInt();
            if(doan>win) System.out.println("Giam xuong");
            else if(doan<win) System.out.println("Tang len");
            else {
                System.out.println("Ban da thang");
                thang++;
                return;
            }
        }
        if(thang==0) {
            System.out.println("Ban da thua");
            System.out.print("Ket qua dung la: "+win);
        }
    }
}
