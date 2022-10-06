import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class ATM {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> list = new ArrayList<>();

        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        int sum=0;
        for(int i=0;i<n;i++){
            sum=sum+list.get(i)*(n-i);
        }
        bw.write(sum+"");
        
        
        bw.flush();
        bw.close();
        br.close();
    }
}
