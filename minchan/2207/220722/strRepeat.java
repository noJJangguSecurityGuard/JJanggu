import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class strRepeat{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        
        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            for(int j=0;j<str.length();j++){
                for(int k=0;k<num;k++){
                    bw.write(str.charAt(j)+"");
                }
            }
            bw.write("\n");
        }
       
       bw.flush();
       bw.close();
       br.close();
    }
}