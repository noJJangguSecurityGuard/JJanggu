import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class accumulate4{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        // 수의 개수 n
        // 합을 구해야하는 횟수 m
        // n개의 수
        // M개의 줄에는 합을 구해야하는 구간 i j 

        int n = Integer.parseInt(st.nextToken());//숫자의 개수
        int m = Integer.parseInt(st.nextToken());//반복수

        // 리스트 만들기
        List<Integer> list = new ArrayList<>();
        st = new StringTokenizer(br.readLine());
        int sum=0;
        list.add(0);
        for(int i =0; i< n ; i++){
            sum+=Integer.parseInt(st.nextToken());
            list.add(sum);
        }
        for(int i=0; i< m;i++){
            st = new StringTokenizer(br.readLine());
            int first  = Integer.parseInt(st.nextToken());
            int last = Integer.parseInt(st.nextToken()); 
            
            bw.write(list.get(last)-list.get(first-1)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}