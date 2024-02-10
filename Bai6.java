public class Bai6 {
    public static void main(String[] args){
        int f0=0, f1 =1, f2=1,so=0;
        while(so<20){
            System.out.print(f2+ " ");
            f0=f1;
            f1=f2;
            f2=f0+f1;
            so++;
        }
    }

}
