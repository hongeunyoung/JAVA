import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] cards = new int[N];
        int M = s.nextInt();
        int max = 0;
    
        for(int i = 0; i < N; i++)
            cards[i] = s.nextInt();
    
        for(int i = 0; i < N - 2; i++) {
            for(int j = i + 1; j < N - 1; j++) {
                for(int k = j + 1; k < N; k++) {
                    int sum = cards[i] + cards[j] + cards[k];
                    if(sum <= M && sum > max)
                        max = sum;
                }
            }
        }
        
        System.out.println(max);
        s.close();
    }
}