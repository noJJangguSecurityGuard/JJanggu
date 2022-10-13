import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;

// 원래 bufferedWriter를 썼는데 
// 메소드가 다른영역이라 System.out 사용함

public class S24480{

    // static영역에 저장
    static ArrayList<Integer>[] list;
    // 방문순서저장배열
    static int[] visited;
    static int order=1;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int node = Integer.parseInt(st.nextToken());
        int edge = Integer.parseInt(st.nextToken());
        int start = Integer.parseInt(st.nextToken());

        // node랑 edge가 정해졌으니 배열사이즈가 결정됨
        list = new ArrayList[node+1];
        visited = new int[node+1]; // 초기값 false로 설정됨

        // 정점 수만큼 인접리스트 초기화
        for(int i=1;i<node+1;i++){
            list[i] = new ArrayList<Integer>(); // 빈값허용
        }

        // 방문순서넣을것
        for(int i=1;i<node+1;i++){
            visited[i] = 0; // 빈값허용
        }

        // 인접리스트 작성, 무방향 - 양쪽다 설정
        for(int i = 0; i<edge;i++){ // edge수만큼 반복
            st=new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            list[u].add(v);
            list[v].add(u);
        }

        // dfs 밖에서 sort
        for(int i=1; i<node+1;i++){
            Collections.sort(list[i], Collections.reverseOrder()); // 내림차순
        }
        

        dfs(start);

        // 방문정렬 출력
        for(int i=1;i<node+1;i++){
            System.out.println(visited[i]);
        }
    } 

    static void dfs(int start){
        visited[start] = order;
        order++;  
        
        for(int i : list[start]){ // 인접한 노드 탐색
            if(visited[i]==0){     // 방문안했으면
                dfs(i); 
            }
        }
    }
}