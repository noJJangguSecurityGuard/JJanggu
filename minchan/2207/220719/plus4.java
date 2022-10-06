import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;



public class plus4 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while(true){
            //br.readLine()에서 읽을 내용이 없을 때 ""을 읽게 되는 것이라고 보여집니다.
            String str = br.readLine();
            if(str==null || str.equals("")) {
                break;
            }
            StringTokenizer st = new StringTokenizer(str);
            
            int sum = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write(sum + "\n");
        }
        
    
        bw.flush();
        bw.close();
    }    
}
