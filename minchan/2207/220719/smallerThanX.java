import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class smallerThanX{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st1.nextToken());
        int x = Integer.parseInt(st1.nextToken());
        System.out.println(st2.countTokens());
        // for문 조건    i< countTokens()    - >  i<n
        // 카운트 토큰은 남은 토큰수를 반환하느 것으로 포문을 때 토큰을 출력하므로 돌때마다 달라짐 
        for(int i=0;i<n;i++){
            int temp = Integer.parseInt(st2.nextToken());
            if(x>temp) bw.write(temp+" ");
        }
        bw.flush();
        bw.close();
    }
}