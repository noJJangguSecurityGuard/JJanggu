import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S1158 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        Queue<Integer> q = new LinkedList<>();
        for(int i=1;i<=n;i++){
            q.add(i);
        }

        bw.write("<");
        while(q.size()!=1){
            // 하나씩 빼고 넣고 반복하면서 진행
            for(int i=0;i<k-1;i++){
                q.add(q.poll());
            }
            bw.write(q.poll()+", ");
        }

        bw.write(q.poll()+">");
        bw.flush();
        bw.close();
        br.close();
    }
    
}
