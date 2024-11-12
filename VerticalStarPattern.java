public class VerticalStarPattern {
    public static void main(String[] args) {
        int[] arr = {8, 3, 12, 1, 6, 15};

        int max = findMax(arr);

        printVerticalStarPattern(arr, max);
    }

    private static int findMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    private static void printVerticalStarPattern(int[] arr, int max) {
        for (int i = max; i > 0; i--) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] >= i) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
