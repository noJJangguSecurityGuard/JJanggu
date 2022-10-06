import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class sumOfNum{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());//숫자
        int cnt=1;
        int start=1;
        int end =start+1;
        int sum=start+end;
        while(start<=n/2){
            if(sum<n){
                end++;
                sum+=end;
            }
            else if(sum==n){
                cnt++;
                end++;
                sum+=end;
            }
            else{
                sum-=start;
                start++;
            }
        }
            
        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}