import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;



public class threeDice {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        if(a==b && a==c){
            bw.write( a*1000 + 10000 + "");
        }
        else if(a==b){
            bw.write(a*100 + 1000+ "");
        }
        else if(a==c){
            bw.write(a*100 + 1000+ "");
        }
        else if(c==b){
            bw.write(b*100 + 1000+ "");
        }
        else{
            int max = a;
            if(max<b)max=b;
            if(max<c)max=c;
            bw.write(max*100+ "");
        }
    
        bw.flush();
        bw.close();
    }    
}
