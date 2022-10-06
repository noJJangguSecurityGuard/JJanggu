import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.util.StringTokenizer;
import java.util.List;
import java.util.ArrayList;


public class gasStation {
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> distance = new ArrayList<>();
        List<Integer> fuelCost = new ArrayList<>();
        //n개의 도시
        //도로의 길이 n-1
        //주유소 가격 n개
        for(int i=0;i<n-1;i++){
            distance.add(Integer.parseInt(st.nextToken()));
        }
        //마지막값 0으로 마지막 배열을 넣어야지 outbound오류방지
        distance.add(0);
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<n;i++){
            fuelCost.add(Integer.parseInt(st.nextToken()));
        }
        
        // 뒤의 주유소가 더비싸면 전주유소에서
        // 누적길이만큼 현주유소에서 주유하기
        // int 4바이트 21억 -> long 4바이트인데??
        // double
        double sum=0;
        double accumulateDis=0;
        for(int i=0;i<n;i++){
            //처음 길이를 부여
            accumulateDis=distance.get(i);
            int last =0;
            for(int j=1;i+j<n;j++){
                if(fuelCost.get(i)<fuelCost.get(i+j)){
                    accumulateDis+=distance.get(i+j);
                    bw.write(j+" ");
                    last=i+j+1;
                    continue;
                }
                sum+=fuelCost.get(i)*accumulateDis;
                i+=j-1;
                break;
                //마지막까지 안돌았을때 계산하는게없다?
            }
            if(last==n){
                sum+=fuelCost.get(i)*accumulateDis;
            }
            
        }  
        bw.write(("\n"+sum).replace(".0",""));      

        // String str="100.0";
        // str=str.replace(".0","" );
        // bw.write(str+"\n");
        
        /*
            5
            1 1 1 10
            1 5 4 3 2
         */


        bw.flush();
        bw.close();
        br.close();
    }
}
