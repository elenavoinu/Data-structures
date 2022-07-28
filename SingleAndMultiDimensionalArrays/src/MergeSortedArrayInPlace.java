public class MergeSortedArrayInPlace {
    public static void main(String[] args) {
        int [] nums1 = new int[] {1,2,3,4,0,0,0,0};
        int [] nums2 = new int[] {5,6,7,8};

        mergeSortedArrays(nums1, nums2);
        for(Integer num : nums1) System.out.print(num); //print the merged array
    }

    public static void mergeSortedArrays(int[] nums1, int[] nums2) {
        int nums1Pointer = nums1.length-1;
        int nums2Pointer = nums2.length-1;
        int i = nums1Pointer;

        while(nums2Pointer >= 0) {
            if(nums1[nums1Pointer] > nums2[nums2Pointer]) {
                nums1[i] = nums1[nums1Pointer--];
            }
            else {
                nums1[i--] = nums2[nums2Pointer--];
            }
        }
    }
}
/*Create 2 pointers that point at the end of last element in the nums1 and nums2
compare num1[nums1Pointer] < nums2[nums2Pointer]
if above condition true, add nums2[nums2Pointer] at the end on nums1

num1= [1,2,3,4, 0,0,0,0]
num2 =[5,6,7,8]

result = [1,2,3,4, 5,6,7,8]

Time complexity = O(n) where n is the number of elements in nums1
Space = O(1) since no extra space was used

*/
