
import java.io.*;
import java.util.Objects;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        StringTokenizer st = new StringTokenizer(s1);
        int num_row = Integer.parseInt(st.nextToken());
        int num_col = Integer.parseInt(st.nextToken());
        String[][] chess_board = new String[num_row][num_col];
        for(int i =0 ; i<num_row;i++) {
            String s2 = br.readLine();
            String[] arr = s2.split("");
            for(int j=0 ; j<num_col;j++) {
                chess_board[i][j] = arr[j];
            }
        }
        int count =0;
        int count1=0;
        int count2=0;

        for(int i=0 ; i<num_row;i++) {
            for(int j =0 ; j<num_col;j++) {
                if((i+j)%2==0) {
                    if(!Objects.equals(chess_board[i][j], "W")) {
                        count1++;
                    }
                    else {
                        count2++;
                    }
                }
                else {
                    if(!Objects.equals(chess_board[i][j], "B")) {
                        count1++;
                    }
                    else {
                        count2++;
                    }
                }
            }
        }
        count = Math.min(count1,count2);
        System.out.println(count);
    }
}

