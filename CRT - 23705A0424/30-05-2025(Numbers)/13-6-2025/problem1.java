import java.util.Arrays;
public class Main{
    public static void main(String[] args){
        long[] memo = new long[100];
        System.out.println(fibMemorization(30,memo));
        System.out.println(fibMemorization(50,memo));
        System.out.println(fibMemorization(70,memo));
        System.out.println(Arrays.toString(memo));
    }
    public static long fib(long n){
        if(n == 0 || n == 1)
        return n;
        return fib(n-1)+fib(n-2);
    }
    public static long fibMemorization(long n, long[] memo){
        if(n == 0 || n == 1)
          return n;
        if(memo[(int)n] != 0)
          return memo[(int)n];
        long val = fibMemorization(n-1,memo) + fibMemorization(n-2,memo);
        memo[(int)n] = val;
        return memo[(int)n];
    }
}