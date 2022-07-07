import java.util.Arrays;

public class CheckSumImproved {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 21, 3, 14, 5, 60, 7, 6};
        System.out.println(Arrays.toString(findSum(arr, 81)));
    }
    public static int[] findSum(int []arr, int n){
        Arrays.sort(arr);
        int startPointer = 0;
        int endPointer = arr.length-1;
        int [] result = new int[2];

        while(startPointer != endPointer) {
            if((arr[startPointer] + arr[endPointer]) == n){
                result[0] = arr[startPointer];
                result[1] = arr[endPointer];
                return result;
            }
            else if(arr[startPointer] + arr[endPointer] > n){
                endPointer--;
            }
            else startPointer++;
        }

        return arr;
    }
}
//While solution #1 is very intuitive,
// it is not very time efficient. A better way to solve this is by first sorting the array.
// Here,QuickSort is used to sort the array first.
// Then using two variables, one starting from the first index of the array and second from size-1

// index of the array. If the sum of the elements on these indexes of the array is smaller than given value n,
// then increment index from the start else decrement index from the end until the given value n is equal to the sum.
// Store the elements on these indexes in result array and return it.



//Since the sorting function used in this code takes O(nlogn)
//O(nlogn)
// and the algorithm to find two numbers takes O(n)
//O(n)
// time, the overall time complexity of this code is O(nlogn
//O(nlogn
//).