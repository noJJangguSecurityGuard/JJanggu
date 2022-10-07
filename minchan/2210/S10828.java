import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;
import java.util.StringTokenizer;

public class S10828 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Stack<String> stk = new Stack<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            if(temp.equals("push")){
                stk.push(st.nextToken());
            }
            else if(temp.equals("pop")){
                if(stk.empty()){
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(stk.pop()+"\n");
                }
            }
            else if(temp.equals("top")){
                
                if(stk.empty()){
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(stk.peek()+"\n");
                }
            }
            else if(temp.equals("empty")){
                if(stk.empty()) {
                    bw.write(1+"\n");
                }
                else {
                    bw.write(0+"\n");
                }
                
            }
            else{
                bw.write(stk.size()+"\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
    
}
