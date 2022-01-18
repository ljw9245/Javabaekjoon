
import java.io.*;

public class Mergesort_imp {
    /* public static void main(String[] args) throws IOException  {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_case = Integer.parseInt(br.readLine());
        int[] num_arr = new int[num_case];
        for(int i=0;i< num_case; i++ ) {
            num_arr[i] = Integer.parseInt(br.readLine());
        }
        Mergesort(num_arr,0,num_case-1);
        StringBuilder sb = new StringBuilder();
        for(int i=0 ; i<num_case; i++) {
            sb.append(num_arr[i]+"\n");
        }
        br.close();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    } */
    public static void Merge(int[] arr, int left, int mid, int right) {
        int[] temp_arr = new int[right-left+1];
        int temp_point = 0;
        int left_point = left;
        int right_point = mid+1;
        while (left_point<=mid && right_point<=right) {
            if(arr[left_point]<=arr[right_point]) {
                temp_arr[temp_point] = arr[left_point];
                left_point++;
            } else {
                temp_arr[temp_point] = arr[right_point];
                right_point++;
            }
            temp_point++;
        }
        if(left_point>mid) {
            for(int i=right_point ; i<=right ; i++) {
                temp_arr[temp_point] = arr[i];
                temp_point++;
            }
        } else {
            for(int i=left_point; i<mid+1; i++) {
                temp_arr[temp_point] = arr[i];
                temp_point++;
            }
        }
        for(int i=0 ; i<right-left+1; i++) {
            arr[left+i] = temp_arr[i];
        }
    }
    public static void Mergesort(int[] arr,int left, int right) {
        if(left==right) return;
        int mid = (left+right)/2;
        Mergesort(arr,left,mid);
        Mergesort(arr,mid+1,right);
        Merge(arr,left,mid,right);
    }
}