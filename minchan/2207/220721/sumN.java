import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sumN{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int count = st.countTokens();
        // int[] a = Integer.parseInt( st.nextToken().charAt(i) );
        int[] a= new int[count];
        for(int i=0;i<count;i++){
            a[i] = Integer.parseInt(st.nextToken());
        }
        
        bw.write(sum(a)+"");

        bw.flush();
        bw.close();
        br.close();

    }
    static long sum(int[] a){
        long sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        return sum;
    }
}
