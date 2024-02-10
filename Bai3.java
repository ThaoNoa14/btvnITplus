import java.util.Scanner;
public class Bai3 {
    public static void main(String[] args){
        Scanner khong = new Scanner(System.in);
        System.out.print("Nhan so: ");
        Double n = khong.nextDouble();
        if(n>0) System.out.println("Positive");
        else if(n<0) System.out.println("Negative");
        else System.out.println(n);
    }
}
