
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;


public class plusCycle1 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n =Integer.parseInt(br.readLine());
        int count=0;
        int newNum =  n;
        while(true){
            int temp1 = newNum/10;
            int temp2 = newNum%10;
            int sum= temp1+temp2;
            newNum =  Integer.parseInt(temp2 + "" + (sum%10));
            count++;

            if(newNum==n) break;
        }
        bw.write(count+"");
        bw.flush();
        bw.close();
    }    
}
