package ss;

public class ss {

	public static void main(String[] args) {
		Map map = new Map(0, new int[4](0, 1, 2, 3));

	}
	
	public class Map {
        int check;
        int[] path = new int[4];
        
		public int getCheck() {
			return check;
		}
		public void setCheck(int check) {
			this.check = check;
		}
		public int[] getPath() {
			return path;
		}
		public void setPath(int[] path) {
			this.path = path;
		}
		public Map(int check, int[] path) {
			super();
			this.check = check;
			this.path = path;
		}  
    }
}



//bfs: 최단 경로 찾기니까 이게 맞겠죠?????
//월욜 과제였던 게임 맵 최단거리 코드 쌔벼서 하기로 했습니다(헉 이젠 내 코드마저 쌔비는? 어 근데 이거 블로그 쌔벼서 공부했던 문제구나 데헷)

import java.util.Queue;
import java.util.LinkedList;

class Solution {
  public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
      int answer = 0;
      
      //x, y에 상하좌우 값을 더하기 위함
      int[] dx = {-1, 0, 1, 0}; // 상하
      int[] dy = {0, -1, 0, 1}; //좌우
      
      //map 만들기
      int[][] map = new int[51][51];
      
      for(int i = 0; i < 51; i++)
          for(int j = 0; j < 51; j++)
              map[i][j] = -1;
      
      for(int i = 0; i < rectangle.length; i++) {
          for(int j = rectangle[i][0]; j <= rectangle[i][2]; j++) {
              for(int k = rectangle[i][1]; k <= rectangle[i][3]; k++) {
                  if(j == rectangle[i][0] || j == rectangle[i][2] || k == rectangle[i][1] || k == rectangle[i][3]) {
                      if(map[j][k] == -1)
                          map[j][k] = 0;
                      else
                          map[j][k] += 0;
                  }                        
                  else
                      map[j][k] += 2;
              }
          }
      }
      //방문한 좌표는 표시(true: 방문)
      boolean[][] visited = new boolean[51][51];
      int x = characterX;
      int y = characterY;
      visited[x][y] = true;
      Queue<Node> que = new LinkedList<>();
      //시작 노드
      que.offer(new Node(x, y, 0));
      
      while(!que.isEmpty()) {
          Node node = que.poll();     
          System.out.println(node.x + " " + node.y + " " + node.cost);
          if(node.x == itemX && node.y == itemY) {
              answer = node.cost;
              break;
          }
          
          //4가지 방향 확인
          for(int i = 0; i < 4; i++) {
              x = node.x + dx[i];
              y = node.y + dy[i];
              
              if(x >= 0 && y >= 0 && x < 51 && y < 51) {
                  if(!visited[x][y] && map[x][y] == 0) {
                      visited[x][y] = true;
                      que.offer(new Node(x, y, node.cost + 1));
                  }                        
              }
          }
      }
      
      return answer;
  }
  
  public class Node {
      int x;
      int y;
      int cost;
      
      public Node(int x, int y, int cost) {
          this.x = x;
          this.y = y;
          this.cost = cost;
      }
  }
}

//bfs: 최단 경로 찾기

import java.util.Queue;
import java.util.LinkedList;

class Solution {
  public int solution(int[][] rectangle, int characterX, int characterY, int itemX, int itemY) {
      int answer = 0;
      //map 만들기
      Map[][] maps = new Map[51][51];
      for(int i = 0; i < 51; i++)
          for(int j = 0; j < 51; j++)
              maps[i][j] = new Map(-1, 0, 0, 0, 0);
      
      //방문한 좌표는 표시(true: 방문)
      boolean[][] visited = new boolean[maps.length][maps[0].length];
      int x = characterX;
      int y = characterY;
      visited[x][y] = true;
      Queue<Node> que = new LinkedList<>();
      
      for(int i = 0; i < rectangle.length; i++) {
          for(int j = rectangle[i][0] + 1; j < rectangle[i][2]; j++)
              for(int k = rectangle[i][1] + 1; k < rectangle[i][3]; k++)
                  maps[j][k].setCheck(maps[j][k].getCheck() + 2);
          
          for(int j = rectangle[i][1]; j <= rectangle[i][3]; j++) {
              if(maps[rectangle[i][0]][j].getCheck() == -1)
                  maps[rectangle[i][0]][j].setCheck(0);
              if(maps[rectangle[i][2]][j].getCheck() == -1)
                  maps[rectangle[i][2]][j].setCheck(0);
              
              if(j != rectangle[i][3]) {
                  maps[rectangle[i][0]][j].setTop(1);
                  maps[rectangle[i][2]][j].setTop(1);   
              }
              
              if(j != rectangle[i][1]) {
                  maps[rectangle[i][0]][j].setBottom(1);
                  maps[rectangle[i][2]][j].setBottom(1);   
              }
              
              if(j > rectangle[i][1] && j < rectangle[i][3]) {
                  maps[rectangle[i][0]][j].setRight(0);
                  maps[rectangle[i][2]][j].setLeft(0);
              }
          }
          
          for(int j = rectangle[i][0]; j <= rectangle[i][2]; j++) {
              if(maps[j][rectangle[i][1]].getCheck() == -1)
                  maps[j][rectangle[i][1]].setCheck(0);
              if(maps[j][rectangle[i][3]].getCheck() == -1)
                  maps[j][rectangle[i][3]].setCheck(0);
              
              if(j != rectangle[i][2]) {
                  maps[j][rectangle[i][1]].setRight(1);
                  maps[j][rectangle[i][3]].setRight(1);
              }
              
              if(j != rectangle[i][0]) {
                  maps[j][rectangle[i][1]].setLeft(1);
                  maps[j][rectangle[i][3]].setLeft(1);                    
              }
              
            
                if(j > rectangle[i][0] && j < rectangle[i][2]) {
                    maps[j][rectangle[i][1]].setTop(0);
                    maps[j][rectangle[i][3]].setBottom(0);                    
                }
          }
      }
      
      //시작 노드
      que.offer(new Node(x, y, 0));
      
      while(!que.isEmpty()) {
          Node node = que.poll();
          x = node.x;
          y = node.y;
          System.out.println(x + " " + y + " " + node.cost);
          if(x == itemX && y == itemY) {
              answer = node.cost;
              break;
          }                
          
          if(maps[x][y].getTop() == 1 && !visited[x][y + 1] && maps[x][y + 1].getCheck() == 0) {
              visited[x][y + 1] = true;
              que.offer(new Node(x, y + 1, node.cost + 1));
          }

          if(maps[x][y].getBottom() == 1 && !visited[x][y - 1] && maps[x][y - 1].getCheck() == 0) {
              visited[x][y - 1] = true;
              que.offer(new Node(x, y - 1, node.cost + 1));
          }

          if(maps[x][y].getLeft() == 1 && !visited[x - 1][y] && maps[x - 1][y].getCheck() == 0) {
              visited[x - 1][y] = true;
              que.offer(new Node(x - 1, y, node.cost + 1));
          }

          if(maps[x][y].getRight() == 1 && !visited[x + 1][y] && maps[x + 1][y].getCheck() == 0) {
              visited[x + 1][y] = true;
              que.offer(new Node(x + 1, y, node.cost + 1));
          }
      }
      
      return answer;
  }
  
  public class Node {
      int x;
      int y;
      int cost;
      
      public Node(int x, int y, int cost) {
          this.x = x;
          this.y = y;
          this.cost = cost;
      }
  }
  
  public class Map {
      int check;
      int top;
      int bottom;
      int left;
      int right;
      
      public Map(int check, int top, int bottom, int left, int right) {
          this.check = check;
          this.top = top;
          this.bottom = bottom;
          this.left = left;
          this.right = right;
      }
      
      public int getCheck() {
			return check;
		}

		public void setCheck(int check) {
			this.check = check;
		}

		public int getTop() {
			return top;
		}

		public void setTop(int top) {
			this.top = top;
		}

		public int getBottom() {
			return bottom;
		}

		public void setBottom(int bottom) {
			this.bottom = bottom;
		}

		public int getLeft() {
			return left;
		}

		public void setLeft(int left) {
			this.left = left;
		}

		public int getRight() {
			return right;
		}

		public void setRight(int right) {
			this.right = right;
		}
  }
}
          if(maps[x][y].getTop() == 1 && !visited[x][y + 1] && maps[x][y + 1].getCheck() == 1) {
              visited[x][y + 1] = true;
              que.offer(new Node(x, y + 1, node.cost + 1));
          }

          if(maps[x][y].getBottom() == 1 && !visited[x][y - 1] && maps[x][y - 1].getCheck() == 1) {
              visited[x][y - 1] = true;
              que.offer(new Node(x, y - 1, node.cost + 1));
          }

          if(maps[x][y].getLeft() == 1 && !visited[x - 1][y] && maps[x - 1][y].getCheck() == 1) {
              visited[x - 1][y] = true;
              que.offer(new Node(x - 1, y, node.cost + 1));
          }

          if(maps[x][y].getRight() == 1 && !visited[x + 1][y] && maps[x + 1][y].getCheck() == 1) {
              visited[x + 1][y] = true;
              que.offer(new Node(x + 1, y, node.cost + 1));
          }
      }
      
      return answer;
  }
  
  public class Node {
      int x;
      int y;
      int cost;
      
      public Node(int x, int y, int cost) {
          this.x = x;
          this.y = y;
          this.cost = cost;
      }
  }
  
  public class Map {
      int check;
      int top;
      int bottom;
      int left;
      int right;
      
      public Map(int check, int top, int bottom, int left, int right) {
          this.check = check;
          this.top = top;
          this.bottom = bottom;
          this.left = left;
          this.right = right;
      }
      
      public int getCheck() {
			return check;
		}

		public void setCheck(int check) {
			this.check = check;
		}

		public int getTop() {
			return top;
		}

		public void setTop(int top) {
			this.top = top;
		}

		public int getBottom() {
			return bottom;
		}

		public void setBottom(int bottom) {
			this.bottom = bottom;
		}

		public int getLeft() {
			return left;
		}

		public void setLeft(int left) {
			this.left = left;
		}

		public int getRight() {
			return right;
		}

		public void setRight(int right) {
			this.right = right;
		}
  }
}