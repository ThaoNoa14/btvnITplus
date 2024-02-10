import java.util.Scanner;
public class Bai1 {
    public static void main(String[] args){
        Scanner nhap = new Scanner(System.in);
        int a = nhap.nextInt(),
                b = nhap.nextInt(),
                c = nhap.nextInt();
        System.out.print("So lon nhat la: ");
        if(a>=b && a>=c){
            System.out.print(a);
        }else if(b>=c && b>=a)
            System.out.print(b);
        else System.out.print(c);
    }
}