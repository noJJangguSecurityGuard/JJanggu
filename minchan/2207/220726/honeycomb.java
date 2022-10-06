import java.io.IOException;
import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class honeycomb{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        int count=1;
        
        if(n!=1){
            n=n-2;
            n=n/6;
            while(n>=0){
                n=n-count;
                count++;
            }
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
        br.close();

    }
}