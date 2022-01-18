
import java.io.*;

public class Countingsort_imp {
  /*  public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num_case = Integer.parseInt(br.readLine());
        int[] num_arr = new int[num_case];
        int[] sorted_arr = new int[num_case];
        int max = 0;
        for(int i=0 ; i<num_case; i++ ) {
            int num = Integer.parseInt(br.readLine());
            if(max<num) max = num;
            num_arr[i] = num;
        }
        br.close();
        int[] count_arr = new int[max+1];
        for(int i=0 ; i<num_case; i++) {
            count_arr[num_arr[i]]++;
        }
        for(int i=0; i<max; i++) {
            count_arr[i+1] = count_arr[i] + count_arr[i+1];
        }
        for(int i=num_case-1; i>=0 ; i--) {
            int denote = count_arr[num_arr[i]];
            count_arr[num_arr[i]]--;
            sorted_arr[denote-1]=num_arr[i];
        }
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<num_case; i++) {
            sb.append(sorted_arr[i]+"\n");
        }
        bw.write(String.valueOf(sb));
        bw.flush();
        bw.close();
    } */
}