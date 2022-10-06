import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class alphabet{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] alphabet = new int[26];
        Arrays.fill(alphabet, -1);
        //인덱스 0  - 97
        
        for(int i=0;i<str.length();i++){
            if(alphabet[str.charAt(i)-97]==-1){
                alphabet[str.charAt(i)-97]=i;
            }
            
        }
        for(int i=0;i<26;i++){
            bw.write(alphabet[i] +" ");
       }
       bw.flush();
       bw.close();
       br.close();
    }
}