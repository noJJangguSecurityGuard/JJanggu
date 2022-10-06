import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class maybeAvg{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int stNum=Integer.parseInt(st.nextToken());
            int sum=0;
            int[] stScore = new int[stNum];
            //평균 구하기
            for(int j=0;j<stNum;j++){
                stScore[j] = Integer.parseInt(st.nextToken());
                sum += stScore[j];
            }
            float avg = sum/stNum;
            //평균 넘는사람 비율 출력
            int count=0;
            for(int j=0;j<stNum;j++){
                if(avg<stScore[j]) count++;
            }
            bw.write( String.format("%.3f" , ((float)100*count)/stNum) + "%\n" );
            
            
           
        }
        bw.flush();
        bw.close();
        br.close();

    }
}
