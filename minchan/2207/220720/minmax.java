import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class minmax{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int max=-1000001;
        int min=1000001;
        for(int i=0;i<n;i++){
            int temp =Integer.parseInt(st.nextToken());
            if(max < temp) max =temp;
            if(min > temp) min =temp;
        }
        bw.write(min +" "+max);
        bw.flush();
        bw.close();
        br.close();

    }
}