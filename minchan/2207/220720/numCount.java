import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class numCount{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());
        String str = Integer.toString(sum);

        int[] number = new int[10];
        for(int i=0;i<number.length;i++){
            number[i]=0;
        }

        for(int i=0;i<str.length();i++){
            int n = Integer.parseInt( String.valueOf(str.charAt(i)) );
            number[n]++;
            
        }
        
        for(int i=0;i<number.length;i++){
            bw.write(number[i]+"\n");
        }

        bw.flush();
        bw.close();
        br.close();

    }
}