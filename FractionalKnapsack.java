// Problem:  {  Java program to solve Fractional Knapsack Problem }

// This problem is solved using a greedy algorithm. The items are sorted by value-to-weight ratio and added to the knapsack.

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;

    
    public Item(int value, int weight) {
        this.value = value;
        this.weight = weight;
    }
}

class FractionalKnapsack {


    static double getMaxValue(Item[] items, int capacity) {
       


        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                double r1 = (double) o1.value / o1.weight;
                double r2 = (double) o2.value / o2.weight;
                return Double.compare(r2, r1);
            }
        });

        double totalValue = 0;

        for (Item item : items) {
            int curWt = item.weight;
            int curVal = item.value;

            if (capacity - curWt >= 0) {
                capacity -= curWt;
                totalValue += curVal;
            } else {
                double fraction = ((double) capacity / curWt);
                totalValue += (curVal * fraction);
                break;
            }
        }

        return totalValue;
    }

    
    public static void main(String[] args) {
        Item[] items = { new Item(60, 10), new Item(100, 20), new Item(120, 30) };
        int capacity = 50;

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value we can obtain = " + maxValue);
    }
}
