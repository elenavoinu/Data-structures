/*Re-arrange Positive & Negative Values*/

public class RearrangeValues {
    public static void main(String[] args) {
        int[] arr = new int[]{10, -1, 20, 4, 5, -9, -6};
        reArangeValues(arr);
    }

    private static void reArangeValues(int[] arr) {
        //new array to store the reshuffled values
        int[] result = new int[arr.length];
        int resultIndex = 0;
        //add negative values to the result
        for (int j : arr) {
            if (j < 0) {
                result[resultIndex++] = j;
            }
        }
        //add positive values
        for(int i : arr){
            if(i >=0) {
                result[resultIndex++] = i;
            }
        }
        for (int j : result) {
            System.out.print(j + " ");
        }
    }
}
