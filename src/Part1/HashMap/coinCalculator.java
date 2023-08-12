package Part1.HashMap;

public class coinCalculator {
    public static float calculateTotalAmount(int count_50, int count_1, int count_2, int count_5) {
        float total_amount = count_50 * 0.5f + count_1 * 1 + count_2 * 2 + count_5 * 5;
        return total_amount;
    }

    public static void main(String[] args) {
        float total_amount = calculateTotalAmount(10, 20, 5, 3);
        System.out.println(total_amount); // Output: 66.5
    }
}
