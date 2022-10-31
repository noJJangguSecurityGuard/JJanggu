import java.util.*;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B2309 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        List<Integer> list = new ArrayList<>();
        int sum=0;
        for(int i=0;i<9;i++){
            int a = Integer.parseInt(br.readLine());
            sum+=a;
            list.add(a);
        }
        int target=sum-100;
        Collections.sort(list);
        int t1=0;
        int t2=0;
        for(int i=0;i<8;i++){
            for(int j=i+1;j<9;j++){
                if(list.get(i)+list.get(j)==target){
                   t1=list.get(i);
                   t2=list.get(j);
                }
            }
        }
        list.remove(list.indexOf(t1));
        list.remove(list.indexOf(t2));

        for(int i=0;i<list.size();i++){
            bw.write(list.get(i)+"\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
