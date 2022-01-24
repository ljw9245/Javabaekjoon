
import java.io.*;

public class Main{
    public static int num_case;
    public static int[][] ability_mat;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num_case = Integer.parseInt(br.readLine());
        for(int i=0; i<num_case; i++) {
            String[] s_arr = br.readLine().split(" ");
            for(int j=0; j<num_case; j++) {
                ability_mat[i][j] = Integer.parseInt(s_arr[j]);
            }
        }

    }
    public static void min_distribution()
}