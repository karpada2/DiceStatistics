public class amounts {
    private final int[] arr; // main array
    private int totalSum = 0;

    public amounts(int maxValue) {
        arr = new int[maxValue+1];
    }

    public void addRoll(int roll) {
        arr[roll]++;
        totalSum += roll;
    }

    private int maxIndex(int[] arr) {
        int maxIndex = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > arr[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }

    public double findMedianValueInCounterArray(int elementNumber) {
        int medianPosition = elementNumber/2;
        int elementSum = 0;

        for (int i = 0; i < arr.length; i++) {
            elementSum += arr[i];
             if (elementSum >= medianPosition) {
                if (elementNumber % 2 == 1) {
                    return i;
                } else if (elementSum == medianPosition) {
                    return (i + (i + 1))/2.0;
                } else {
                    return i;
                }

            }
        }
        return -1;
    }



    // gets how many rolls were made and prints the array, including percentages, median, and average
    public void printArray(int rollsAmount) {
        System.out.println("Average roll: " + (float)(totalSum)/rollsAmount);
        System.out.println("Mode roll: " + maxIndex(arr));
        System.out.println("Median roll: " + findMedianValueInCounterArray(rollsAmount) + "\n");
        double currentPercent;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                currentPercent = ((((double)(arr[i]))/rollsAmount) * 100);
                String graphRepresent = "\u25A0".repeat((int)(Math.round(currentPercent)));
                System.out.printf("[%-4s %-,3d%s %-,10d %-4s %-,10f %-4s]%s%n",
                  "Count for", i, ": ", arr[i], " which is ", currentPercent, "% ", graphRepresent);
            }
        }
    }
}
