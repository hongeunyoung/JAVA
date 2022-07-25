//한 지점에 3가지 길이 있다고 생각하겠어요
//bfs로 누가 가장 먼저 목표 개수에 도달하는지 구하겠어요!!
//최소 시간 == 최단 거리 라고 생각해요

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Queue;
import java.util.LinkedList;

public class Main {
	static int count;
	public static void main(String[] args) throws IOException{
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int S = Integer.parseInt(bf.readLine());
		Queue<Node> que = new LinkedList<>();
		que.offer(new Node(1, 0, 0));
		boolean[][] visited = new boolean[10000][10000];
		visited[1][0] = true;
		
		while(!que.isEmpty()) {
			Node node = que.poll();
            if(node.count == S) {
            	System.out.println(node.cost);
            	break;
            }

        	//1번 연산
    		if(!visited[node.count][node.count] && node.count > 0) {
            	visited[node.count][node.count] = true;
                que.offer(new Node(node.count, node.count, node.cost + 1));
    		}
           
            //2번 연산
            if(node.clip > 0 && !visited[node.count + node.clip][node.clip]) {
            	visited[node.count + node.clip][node.clip] = true;
            	que.offer(new Node(node.count + node.clip, node.clip, node.cost + 1));
            }

        	//3번 연산
            if(node.count > 0 && !visited[node.count - 1][node.clip]) {
            	visited[node.count - 1][node.clip] = true;
                que.offer(new Node(node.count - 1, node.clip, node.cost + 1));
            }            
        }
	}
}

class Node {
	int count;
	int clip;
	int cost;
	
	public Node(int count, int clip, int cost) {
		this.count = count;
		this.clip = clip;
		this.cost = cost;
	}
}