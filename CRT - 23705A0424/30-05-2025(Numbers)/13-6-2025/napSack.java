public class Main {
    public static void main(String[] args) {
        int[] weights = {1, 3, 5, 7};
        int[] profits = {2, 4, 7, 10};
        int bagWeight = 8;
        System.out.println("Maximum profit = " + napSack(bagWeight, 0, weights, profits));
    }
    public static int napSack(int bagWeight, int selectedElement, int[] weights, int[] profits) {
        if (selectedElement >= weights.length || bagWeight == 0) {
            return 0;
        }
        int notPick = napSack(bagWeight, selectedElement + 1, weights, profits);
        int pick = 0;
        if (weights[selectedElement] <= bagWeight) {
            pick = profits[selectedElement] + napSack(bagWeight - weights[selectedElement], selectedElement + 1, weights, profits);
        }
        return Math.max(pick, notPick);
    }
}
