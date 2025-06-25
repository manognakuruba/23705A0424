import java.util.*;

public class MinOperationsToOneRecursive {

    // Recursive function to find factors of num between start and sqrt(num)
    private static List<Integer> getFactors(int num, int start) {
        if (start > Math.sqrt(num)) {
            return new ArrayList<>();
        }

        List<Integer> factors = getFactors(num, start + 1);
        if (num % start == 0 && start != 1 && start != num) {
            factors.add(start);
            int otherFactor = num / start;
            if (otherFactor != start && otherFactor != 1 && otherFactor != num) {
                factors.add(otherFactor);
            }
        }
        return factors;
    }

    // Memoization map to avoid recomputation
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int minOperations(int n) {
        if (n == 1) return 0;
        if (memo.containsKey(n)) return memo.get(n);

        // Operation 1: subtract 1
        int minSteps = 1 + minOperations(n - 1);

        // Operation 2: divide by factors (try all factors recursively)
        List<Integer> factors = getFactors(n, 2);
        for (int factor : factors) {
            minSteps = Math.min(minSteps, 1 + minOperations(n / factor));
        }

        memo.put(n, minSteps);
        return minSteps;
    }

    public static void main(String[] args) {
        int n = 25;
        System.out.println("Minimum operations to convert " + n + " to 1: " + minOperations(n));
    }
}
