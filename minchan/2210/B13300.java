import java.util.StringTokenizer;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class B13300 {
    public static void main(String [] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int roomCount=0;
        int[][] student = new int[4][7];

        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            int gender = Integer.parseInt(st.nextToken());
            int age = Integer.parseInt(st.nextToken());
            
            if(student[gender+2][age]==0){ // 처음 등장이면 1 추가해주자
                student[gender+2][age]=1;
                roomCount++;
            }
            student[gender][age]++; 
            if(student[gender][age]>k){
                student[gender][age]=1;
                roomCount++;
            }
        }
        bw.write(roomCount+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
