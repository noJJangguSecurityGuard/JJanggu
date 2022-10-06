import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;

public class coin0{
    public static void main(String[] args) throws IOException{
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        List<Integer> list = new ArrayList<>();

        //제네릭 연습? List에 넣기
        for(int i=0;i<n;i++){
            list.add(Integer.parseInt(br.readLine()));
        }

        //뒤에서 부터 해주자 n==list.size() 니까 1빼서계산
        //포문 하나줄일수 있을까?
        int count=0;
        for(int i = n-1 ;i>=0;i--){
            int money = list.get(i);
            int number = k/money;
            if(number==0){
                continue;
            }
            else{
                count+=number;
                k=k-money*number;
            }
            // while(k/money!=0){
            //     k-=money;
            // }
        }

        bw.write(count+"");


        bw.flush();
        bw.close();
        br.close();
    }
}