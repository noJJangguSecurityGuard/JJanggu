import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.*;

public class sortinside  {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String n = br.readLine();
        List<Integer> list =new ArrayList<>();

        for(int i=0; i< n.length(); i++){
            list.add(Integer.parseInt(""+n.charAt(i)));
        }

        // Collections.reverse(list);
        Collections.sort(list,Comparator.reverseOrder());

        for(int i =0; i<n.length();i++){
            bw.write(list.get(i)+"");
        }

        bw.close();
        br.close();

    }
    
}
