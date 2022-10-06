import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int a = n * Character.getNumericValue(str.charAt(2));
        int b = n * Character.getNumericValue(str.charAt(1));
        int c = n * Character.getNumericValue(str.charAt(0));
        // int a = n * (str.charAt(2) - '0');
        // int b = n * (str.charAt(1) - '0');
        // int c = n * (str.charAt(0) - '0'); //char -> int 자동형변환?
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(a+b*10+c*100);
    }
}