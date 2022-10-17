import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class S2606 {

    static ArrayList<Integer>[] list;
    static boolean[] visited;
    static int cnt;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int node = Integer.parseInt(br.readLine());
        int edge = Integer.parseInt(br.readLine());

        //방문한곳 초기화
        visited = new boolean[node+1];
        list = new ArrayList[node+1];

        // 인접리스트 초기화
        for(int i=1; i<node+1; i++){
            list[i]=new ArrayList<Integer>();
        }

        // 인접리스트 만들기
        for(int i=0; i<edge; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }

        // dfs
        cnt=-1; // 자기자신 -1
        dfs(1);
        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }

    static void dfs(int start){
        //방문했으면 나가기
        if(visited[start]==true){
            return;
        }
        visited[start]=true;
        cnt++;
        for(int i : list[start]){
            if(!visited[i]){
                dfs(i);
            }
        }
    }

}
