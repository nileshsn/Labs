import java.util.*;

class Item {
    double weight, value, ratio;

    Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / weight;
    }
}

class Knapsack {
    double getMaxValue(int n, double w, double[] wt, double[] val) {
        Item[] items = new Item[n];
        for (int i = 0; i < n; i++) {
            items[i] = new Item(wt[i], val[i]);
        }

        // Sort items by value-to-weight ratio in descending order
        Arrays.sort(items, (a, b) -> Double.compare(a.ratio, b.ratio));

        double totalValue = 0.0;
        double remainingWeight = w;

        for (Item item : items) {
            if (item.weight <= remainingWeight) {
                totalValue += item.value;
                remainingWeight -= item.weight;
            } else {
                totalValue += item.value * (remainingWeight / item.weight);
                break;
            }
        }

        return totalValue;
    }
}

public class FracKnapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the number of items: ");
        int n = in.nextInt();

        System.out.println("Enter the maximum weight capacity: ");
        double w = in.nextDouble();

        double[] wt = new double[n];
        double[] val = new double[n];

        System.out.println("Enter the weights and values of the items: ");
        for (int i = 0; i < n; i++) {
            wt[i] = in.nextDouble();
            val[i] = in.nextDouble();
        }

        Knapsack knapsack = new Knapsack();
        double maxValue = knapsack.getMaxValue(n, w, wt, val);

        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
