
import java.util.ArrayList;
import java.util.Scanner;

public class Operatorsolver {
    public static int[] num_operator;
    public static int[] num_arr;
    public static int num_case;
    public static ArrayList<Integer> find_num;
  /*  public static void main(String[] args)  {
        Scanner ms = new Scanner(System.in);
        find_num = new ArrayList<>();
        num_case = ms.nextInt();
        num_arr = new int[num_case];
        for(int i=0; i<num_case; i++) {
            num_arr[i] = ms.nextInt();
        }
        num_operator = new int[4];
        for(int i=0; i<4; i++) {
            num_operator[i] = ms.nextInt();
        }
        ms.close();
        Operator_Solver(0,num_arr[0]);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<find_num.size(); i++) {
            int temp = find_num.get(i);
            if(max<temp) max = temp;
            if(min>temp) min = temp;
        }
        System.out.println(max);
        System.out.print(min);
    }  */

    public static void Operator_Solver(int depth,int current) {
        if(depth==num_case-1) {
            find_num.add(current);
            return;
        }
        for(int i=0 ; i<4 ; i++) {
            if(num_operator[i]>0) {
                num_operator[i]--;
                switch (i) {
                    case 0 : Operator_Solver(depth+1,current+num_arr[depth+1]); break;
                    case 1 : Operator_Solver(depth+1,current-num_arr[depth+1]); break;
                    case 2 : Operator_Solver(depth+1,current * num_arr[depth+1]); break;
                    case 3 : Operator_Solver(depth+1, current/num_arr[depth+1]); break;
                }
                num_operator[i]++;
            }
        }
    }
}