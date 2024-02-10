import java.sql.SQLOutput;

public class Bai5 {
    public static void main(String[] args) {
        int so, sum;
            so = 0;
            int i = 2;
            do{
                sum = 0;
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) sum++;
                }
                if (sum == 0) {
                    System.out.print(i + " ");
                    so++;
                }
                i++;
            } while (so<20);
    }
}