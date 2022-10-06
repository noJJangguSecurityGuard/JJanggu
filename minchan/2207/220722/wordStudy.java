import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class wordStudy{
    public static void main(String[] args)throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        String str = br.readLine();
        int[] alphabet= new int[26];
        str=str.toUpperCase();
        for(int i=0;i<str.length();i++){
            alphabet[str.charAt(i)-65]++;
        }
        int max=0;
        int index=0;
        for(int i=0;i<26;i++){
            if(max<alphabet[i]) {
                max=alphabet[i];
                index=i;
            }
        }
        int count=0;
        for(int i=0;i<26;i++){
            if(max==alphabet[i]) count++;
        }
        if(count==1) bw.write( (char)(index+65) +"");
        else bw.write("?");
       
       bw.flush();
       bw.close();
       br.close();
    }
}