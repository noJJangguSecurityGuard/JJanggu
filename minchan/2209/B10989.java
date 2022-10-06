import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class B10989 {
    
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine()); 

        // 아래식은 메모리 초과 발생
        // List<Integer> list = new ArrayList<>();
        // 
        // for(int i=0;i<n;i++){
        //     list.add(Integer.parseInt(br.readLine()));
        // }
        // Collections.sort(list);
        // for(Integer i : list){
        //     bw.write(i +"\n");
        // } 

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        for(Integer i : arr){
            bw.write(i +"\n");
        } 
        
        bw.flush();
        bw.close();
        br.close();
    }
}
