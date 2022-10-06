import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class OXQuiz{
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n=Integer.parseInt(br.readLine());
        
        for(int j=0;j<n;j++){
            
            bw.write("\n");
        }
        bw.flush();
        bw.close();
        br.close();

    }
}

//그럼 0부터 더하기시작~
//개수만큼 포문 더하기 1씩증가 그리고 더하기
//x 만나면 더하는값 0 만들기 