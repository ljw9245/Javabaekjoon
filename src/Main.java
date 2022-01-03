
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        long a = myscanner.nextInt();
        myscanner.close();
        int n = 1;
        while (a >(( n *n-n)/2) + 1) {
            if (a > (( n *n-n)/2) + 1) {
                n++;
            }
        }
        long q = (( n *n-n)/2) + 1;
        if (a-q==0) {
            System.out.println("1/"+n);
        }
    }
}

