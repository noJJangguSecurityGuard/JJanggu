import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int answer=1;
        for(int i = Integer.parseInt(br.readLine()) ; i>0 ; i--){
            answer=answer*i;
        }
        bw.write(answer+"");
        bw.close();
        br.close();
        
    }
}