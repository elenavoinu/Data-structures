import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {
        int [] arr1 = new int[]{1,3,5,9};
        int [] arr2 = new int[]{2,4,6,7,8};

        System.out.println(Arrays.toString(mergeSortedArrays(arr1, arr2)));
    }

    public static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];
        int resultIndex = 0, i = 0, j = 0;

        // check if elements in the first array are less than second array
        //if so, populate the result array
        while(i < arr1.length && j < arr2.length) {
            if(arr1[i] < arr2[j]){
                result[resultIndex] = arr1[i];
                resultIndex++;
                i++;
            }
            else {
                result[resultIndex] = arr2[j];
                resultIndex++;
                j++;
            }
        }
        // add the remaining elements
        while(i < arr1.length) {
            result[resultIndex] = arr1[i];
            resultIndex++;
            i++;
        }
        while(j < arr2.length) {
            result[resultIndex] = arr2[j];
            resultIndex++;
            j++;
        }

        return result;
    }
}
/*
* In the solution above, we start by creating a new empty array of the size equal to the sum of sizes of input arrays.
* Starting off from the index 0 individually compare the elements at corresponding indexes of both arrays.
*  Place the element with smaller value in the resultant array, and increment the index of the array where you find the smallest element.
*  Keep repeating this till you hit the end of one array. Move the elements of the other array into the resultantArray as it is.

Time Complexity#
The time complexity for this algorithm is O(n+m)
O(n+m)
, where n and m are the sizes of arr1 and arr2, respectively.
* This is because both arrays are iterated over once.*/