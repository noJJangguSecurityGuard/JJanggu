import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class G1377 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        Boolean b = false;
        for(int i=1;i<n-1;i++){
            b=false;
            for(int j=1;j<n-1;j++){
                b=true;
                if(list.get(j)>list.get(j+1));
                list.add(list.get(j+1),j);
                list.remove(j+2);
            }
            if(b=false){
                bw.write(i+"\n");
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
