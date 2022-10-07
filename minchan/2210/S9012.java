import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.Stack;

public class S9012 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        Stack<Character> stk = new Stack<>();
        for(int i=0;i<n;i++){
            char[] arr=br.readLine().toCharArray();
            for(int j=0;j<arr.length;j++){
                if(stk.empty())stk.push(arr[j]);
                else if(stk.peek()=='(' && arr[j]==')'){
                    stk.pop();
                }
                else {
                    stk.push(arr[j]);
                }
            }

            if(stk.empty()){
                bw.write("YES"+"\n");
            }
            else{
                bw.write("NO"+"\n");
            }
            stk.clear();
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
