import java.util.Scanner;

public class Main{
    public static int n;
    public static int num_case;
    public static int count;
    public static boolean[][] chess_board;
    public static void main(String[] args) {
        Scanner ms = new Scanner(System.in);
        n = ms.nextInt();
        chess_board = new boolean[n][n];
        nqueen();
    }

    public static void nqueen() {
        if(count==n) {
            System.out.println(num_case);
        }
        for(int i=0 ; i<n ; i++) {
            for(int j=0 ; j<n ; j++) {
                if(!chess_board[i][j]) {
                    chess_board[i][j] = true;
                    count++;
                    for(int k=0; k<n ; k++) {
                        chess_board[i][k] = true;
                        chess_board[k][j] = true;
                    }

                }
            }
        }

    }
}
