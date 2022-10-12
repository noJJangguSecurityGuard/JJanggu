import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.ArrayList;

public class S11724 { 

    // static 영역에 저장함으로 전역변수처럼 사용
    static ArrayList<Integer>[] list;
    static boolean[] visited;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        //int start = Integer.parseInt(st.nextToken());

        list = new ArrayList[node+1];   
        visited = new boolean[node+1]; // 초기값은 false

    
        
        // 인접리스트 초기화  노드수 만큼, 1부터시작
        for(int i=1;i<node+1;i++){
            list[i] = new ArrayList<Integer>();
        }
        
        // 인접리스트 만들기 무방향 
        for(int i=0;i<edge;i++){ // 간선 수 만큼
            
            st=new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }
        
        // dfs 호출
        int cnt =0;
        for(int i=1;i<node+1 ;i++){
            if(!visited[i]){    // 방문하지않았으면
                cnt++;
                DFS(i);
            }
        }

        bw.write(cnt+"");
        bw.flush();
        bw.close();
        br.close();
    }

    static void DFS(int index){

        if(visited[index]) {  // 방문했으면(true) 나가기
            return;
        }

        visited[index]=true;
        for(int i : list[index]){
            if(visited[i]==false){  // 방문하지 않은 노드만 탐색
                DFS(i);
            }
        }
    }
}