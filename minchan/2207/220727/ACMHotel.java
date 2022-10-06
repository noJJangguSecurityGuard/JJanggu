import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;

public class ACMHotel{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st.nextToken());
        for(int i=0; i< t; i++){
            st=new StringTokenizer(br.readLine());
            int f = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            // n/f 몫 = 0이면 1호 라인
            int line = n/f +1;
            // n%f 몫 = 0이면 1층
            int floor = n%f ;
            if(floor==0){
                floor=f;
                line--;
            }
            if(line<10){
                bw.write(""+floor+"0"+line+"\n");
            }
            else{
                bw.write(""+floor+line+"\n");
            }
            

        }
        bw.flush();
        bw.close();
        br.close();
    }
}