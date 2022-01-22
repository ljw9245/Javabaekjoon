import java.io.*;

public class sudoku_solver{
    public static int[][] sudoku_board;
 /*   public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        sudoku_board = new int[9][9];
        for(int i=0; i<9; i++) {
            String s = br.readLine();
            String[] s_arr = s.split(" ");
            for(int j=0; j<9 ; j++) {
                int temp = Integer.parseInt(s_arr[j]);
                sudoku_board[i][j] = temp;
            }
        }
        Solve_sudoku(0,0);

    } */
    public static void Solve_sudoku(int row, int col) {
        if(col==9) {
            Solve_sudoku(row+1,0);
            return;
        }
        if(row==9) {
            StringBuilder sb = new StringBuilder();
            for(int i=0;i<9;i++) {
                for(int j=0; j<9; j++) {
                    if(j<8) sb.append(sudoku_board[i][j]).append(" ");
                    else sb.append(sudoku_board[i][j]);
                }
                if(i<8) sb.append("\n");
            }
            System.out.print(sb);
            System.exit(0);
        }
        if(sudoku_board[row][col]==0) {
            for(int k=1 ; k<=9 ; k++) {
                if(check_position(row,col,k)) {
                    sudoku_board[row][col] = k;
                    Solve_sudoku(row,col+1);
                }
            }
            sudoku_board[row][col] = 0;
            return;
        }
        Solve_sudoku(row,col+1);
    }
    public static boolean check_position(int i, int j, int check) {
        for(int k=0; k<9; k++) {
            if(check==sudoku_board[i][k]) {
                return false;
            }
            else if (check==sudoku_board[k][j]) {
                return false;
            }
        }
        if(i<3 && j<3) {
            for(int k1=0; k1<3 ; k1++) {
                for(int k2=0; k2<3 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        else if(i < 3 && j < 6) {
            for(int k1=0; k1<3 ; k1++) {
                for(int k2=3; k2<6 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        else if(i<3 && j<9) {
            for(int k1=0; k1<3 ; k1++) {
                for(int k2=6; k2<9 ;k2++) {
                    if(check==sudoku_board[k1][k2])  {
                        return false;
                    }
                }
            }
        }
        else if(i<6 && j<3) {
            for(int k1=3; k1<6 ; k1++) {
                for(int k2=0; k2<3 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        else if(i < 6 && j < 6) {
            for(int k1=3; k1<6 ; k1++) {
                for(int k2=3; k2<6 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        else if(i<6 && j<9) {
            for(int k1=3; k1<6 ; k1++) {
                for(int k2=6; k2<9 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        else if(i<9 && j<3) {
            for(int k1=6; k1<9 ; k1++) {
                for(int k2=0; k2<3 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        else if(i<9 && j<6) {
            for(int k1=6; k1<9 ; k1++) {
                for(int k2=3; k2<6 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        else if (i<9 && j<9) {
            for(int k1=6; k1<9 ; k1++) {
                for(int k2=6; k2<9 ;k2++) {
                    if(check==sudoku_board[k1][k2]) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}