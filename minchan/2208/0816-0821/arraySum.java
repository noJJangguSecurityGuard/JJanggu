import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class arraySum{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine()); // 숫자의 개수
        int m = Integer.parseInt(br.readLine()); // 타겟 번호
        StringTokenizer st = new StringTokenizer(br.readLine());        

        for(int i =0; i< n ; i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);

        int cnt=0;
        int start = 0;
        int end = n-1;
        int sum = 0;
        while(start!=end){
            sum = list.get(start)+list.get(end);
            if(sum==m){
                cnt++;
                start++;
            }
            else if(sum<m){
                start++;
            }
            else{ //타겟보다 크면
                end--;
            }
        }
        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }
}