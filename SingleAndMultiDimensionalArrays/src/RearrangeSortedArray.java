/*In this problem, you have to implement the void maxMin(int[] arr) method.
This will re-arrange the elements of a sorted array in such a way that the first position
 will have the largest number, the second will have the smallest,
 the third will have the second-largest, and so on.*/
public class RearrangeSortedArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        rearrangeArray(arr);
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }

    private static void rearrangeArray(int[] arr) {
        //min & max indexes
        int min = 0;
        int max = arr.length - 1;
        int [] result = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0){
                result[i] = arr[max];
                max--;
            }
            else {
                result[i] = arr[min];
                min++;
            }
        }
        // copying to original array
        System.arraycopy(result, 0, arr, 0, arr.length);
    }
}
// Runtime O(n); Space O(n) since we're creating a new array
