import java.util.Scanner;
public class Bai2 {
    public static void main(String[] args){
        Scanner diem = new Scanner(System.in);
        double n;
        do{
            System.out.print("Ban hay nhap diem cua ban: ");
            n = diem.nextDouble();
            if (0>n || n>10) System.out.println("Nhan sai so diem, hay nhap lai");
        }while (0>n || n>10);
        System.out.println("--------------------------------");
        System.out.print("Xep hang cua ban la: ");
        if(n>=8){
            System.out.print("Gioi");
        } else if (n>=6.5){
            System.out.print("Kha");
        } else if (n>=5){
            System.out.print("Trung binh");
        } else System.out.print("Yeu");
    }
}
