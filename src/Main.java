
import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        br.close();
        String[] arr_s = s.split(" ");
        int count = arr_s.length;
        if(arr_s[0]==" ") {
            count = count-1;
        }
        System.out.println(arr_s[0]+"nmh");
    }
}


