import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ_1463 {
    static int answer = Integer.MAX_VALUE;
    static  int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int N = Integer.parseInt(br.readLine());
        cnt = 0;
        dp(N);
        System.out.println(answer);
    }
    public static void dp(int num){
        if(num == 1) {
            answer = Math.min(answer,cnt);
            return;
        }
        if(num % 3 == 0){
            cnt++;
            dp(num/3);
            cnt--;
        }
        if(num % 2 == 0){
            cnt++;
            dp(num/2);
            cnt--;
        }
        cnt++;
        dp(num-1);
        cnt--;
    }
}
