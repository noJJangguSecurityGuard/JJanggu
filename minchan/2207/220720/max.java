import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class max{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count=1;
        int max=0;
        int num=0;
        while(true){
            //br.readLine()에서 읽을 내용이 없을 때 ""을 읽게 되는 것이라고 보여집니다.
            String str = br.readLine();
            if(str==null || str.equals("")){
                
                break;
            }
            int readNum = Integer.parseInt(str);
            if(max<readNum){
                num=count;
                max=readNum;
            }

            count++;
        }
        bw.write(max+"\n"+num);
        bw.flush();
        bw.close();
        br.close();
    }
}