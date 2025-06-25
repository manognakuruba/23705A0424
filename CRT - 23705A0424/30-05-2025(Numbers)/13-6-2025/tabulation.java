import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int n = 50;
        long[] memo = new long[100]; 
        memo[0] = 0;
        memo[1] = 1;
        System.out.println(fibTabulation(n, memo));
        System.out.println(Arrays.toString(memo));
    }
    public static long fibTabulation(int n, long[] memo) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        for (int i = 2; i <= n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}
