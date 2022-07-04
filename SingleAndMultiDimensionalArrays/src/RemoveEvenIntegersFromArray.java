import java.util.Arrays;

public class RemoveEvenIntegersFromArray {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(removeEvenIntegers(array)));
    }
    public static int[] removeEvenIntegers(int [] array) {
        int oddElements = 0;
        // get the odd elements count
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                oddElements++;
            }
        }
        int [] result = new int[oddElements];
        int resultIndex = 0;

        //add odd elements to result array and return it
        for(int i = 0; i < array.length; i++) {
            if(array[i] % 2 != 0) {
                result[resultIndex] = array[i];
                resultIndex++;
            }
        }
        return result;
    }
}
