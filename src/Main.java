
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner ms = new Scanner(System.in);
        int num_case = ms.nextInt();
        int[] num_arr = new int[num_case];
        for(int i=0; i<num_case; i++) {
            num_arr[i] = ms.nextInt();
        }
        int[] num_operator = new int[4];
        for(int i=0; i<4; i++) {
            num_operator[i] = ms.nextInt();
        }
        ms.close();
    }
}