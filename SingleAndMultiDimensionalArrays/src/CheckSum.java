import java.util.Arrays;

public class CheckSum {
    public static void main(String[] args) {
        int[] array = new int[] {1, 21, 3, 14, 5, 60, 7, 6};
        System.out.println(Arrays.toString(findSum(array, 81)));
    }
    public static int[] findSum(int[] array, int n) {
        int[] result = new int[2];
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array.length; j++) {
                if(array[i] + array[j] == n){
                    result[0] = array[i];
                    result[1] = array[j];
                    return result;

                }
            }
        }
        return array;
    }
}
//O(N^2)
//Traverse the whole array of the given size. For each element in the array,
// check if it can add up with any element after it to give the number n.
// Use a nested for-loop for this purpose and iterate over the entire array for each element.