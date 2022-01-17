
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        Scanner ms = new Scanner(System.in);
        int num_case = ms.nextInt();
        int[] num_arr = new int[num_case];
        for(int i=0;i< num_case; i++ ) {
            num_arr[i] = ms.nextInt();
        }
        Mergesort(num_arr,0,num_case);
        for(int i=0 ; i<num_case; i++) {
            System.out.println(num_arr[i]);
        }
    }
    public  static  void Merge(int[] arr, int left, int mid, int right) {
        int[] temp_arr = new int[arr.length];

    }
    public static void Mergesort(int[] arr,int left,int right) {
        if(left==right) return;
        int mid = (left+right)/2;
        Mergesort(arr,left,mid);
        Mergesort(arr,mid+1,right);
        Merge(arr,left,mid,right);
    }
}

