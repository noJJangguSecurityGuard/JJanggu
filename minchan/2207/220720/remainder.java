import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.List;
import java.util.ArrayList;

public class remainder {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<10;i++){
            int num = Integer.parseInt(br.readLine())%42;
            if(list.contains(num)==false){
                list.add(num);
            }
        }
        bw.write(list.size()+"");
        bw.flush();
        br.close();
    }
    
}
