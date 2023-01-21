import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");


        //    Input: digits = [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
//    Incrementing by one gives 123 + 1 = 124.
//    Thus, the result should be [1,2,4].

        int [] nums = {1,2,3};



        Solution sl = new Solution();

        var output=sl.plusOne(nums);
        System.out.println(Arrays.toString(output));





    }




}