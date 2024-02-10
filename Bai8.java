public class Bai8 {
    public static void main(String[] args){
        for(int i=1;i<=100;i++){
            System.out.print(i+" ");
            if(i%3==0 && i%5==0) System.out.print("Hello World   ");
            else if(i%3==0) System.out.print("Hello   ");
            else if(i%5==0) System.out.print("World   ");

        }
    }
}
