import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class hansu{
    static int answer=0;
    public static void main(String[] args)throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        for(int i=1; i<=n;i++){
            check(i);
        }
        bw.write(answer+"");
        bw.flush();
        bw.close();
        br.close();
    }

    static void check(int num){
        int length = (num+"").length();
        int count=0;
        if(100>num)answer++;
        else{
            while(num>=100){
                int temp = num;
                int first=temp%10;
                temp= temp/10;
                int second=temp%10;
                temp= temp/10;
                int third = temp%10;
                if(second-first == third-second) count++;
                num/=10;
            }
            if(count==length-2) answer++;
        }

    }

}
