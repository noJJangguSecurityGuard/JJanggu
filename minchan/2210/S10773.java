import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class S10773 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int testcase = Integer.parseInt(br.readLine());
        Stack<Integer> stk = new Stack<>();
        int num;
        for(int i=0;i<testcase;i++){
            num=Integer.parseInt(br.readLine());
            if(num==0){
                if(!stk.empty()){
                    stk.pop();
                }
            }
            else{
                stk.push(num);
            }
        }

        int sum=0;
        while(!stk.empty()){
            sum+=stk.pop();
        }
        bw.write(sum+"");
        bw.flush();
        bw.close();
        br.close();
    }
}
