import java.io.IOException;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class sangsu{
    public static void main(String[] args)throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int first = rNum(st.nextToken());
        int sec = rNum(st.nextToken());
        if(first>sec) bw.write(first+"");
        else bw.write(sec+"");
        bw.close();
        br.close();


    }


    public static int rNum(String strnum){

        char[] num=new char[3];
        for(int i=0; i<strnum.length();i++){
            num[i]=strnum.charAt(i);
        }
        char temp= num[0];
        num[0]=num[2];
        num[2]=temp;

        return Integer.parseInt(""+num[0]+num[1]+num[2]);
    }
}