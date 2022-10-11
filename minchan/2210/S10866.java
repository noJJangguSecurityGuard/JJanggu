import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class S10866 {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st;
        Deque<String> dq = new LinkedList<>();
        for(int i=0;i<n;i++){
            st = new StringTokenizer(br.readLine());
            String temp = st.nextToken();
            if(temp.equals("push_back")){
                dq.addLast(st.nextToken());
            }
            else if(temp.equals("push_front")){
                dq.addFirst(st.nextToken());
            }
            else if(temp.equals("pop_front")){
                if(dq.size()==0){
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(dq.pollFirst()+"\n");
                }
            }
            else if(temp.equals("pop_back")){
                if(dq.size()==0){
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(dq.pollLast()+"\n");
                }
            }
            else if(temp.equals("front")){
                
                if(dq.size()==0){
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(dq.getFirst()+"\n");
                }
            }
            else if(temp.equals("back")){
                
                if(dq.size()==0){
                    bw.write(-1+"\n");
                }
                else {
                    bw.write(dq.getLast()+"\n");
                }
            }
            else if(temp.equals("empty")){
                if(dq.size()==0) {
                    bw.write(1+"\n");
                }
                else {
                    bw.write(0+"\n");
                }
                
            }
            else{
                bw.write(dq.size()+"\n");
            }

        }
        bw.flush();
        bw.close();
        br.close();
    }
    
}
