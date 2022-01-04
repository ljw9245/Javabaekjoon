
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        int num_case = ms.nextInt();
        for(int i=0 ; i<num_case;i++) {
            int h = ms.nextInt();
            int room = ms.nextInt();
            int p = ms.nextInt();
            int a = p%h;
            int b = p/h;
            if(h<10) {
                if (a == 0) {
                    a = h;
                }
                if (b < 10) {
                    System.out.println(a+"0"+(b+1));
                } else {
                    System.out.println(a+""+(b+1));
                }
            }
            else {
                if (a==0) {
                    a = h;
                }
                if (b < 10) {
                    System.out.println(a+"0"+(b+1));
                } else {
                    System.out.println(a+""+(b+1));
                }
            }
        }
    }
}

