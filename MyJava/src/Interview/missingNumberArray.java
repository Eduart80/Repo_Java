package Interview;

import java.util.Arrays;

public class missingNumberArray {
    public static void main(String[] args) {
        
/**
 * Given an array nums containing n distinct numbers in the range [0, n],
 * return the only number in the range that is missing from the array.
 * Example 1:
 * Input: nums = [3,0,1]
 * Output: 2
 */
        // more than one missing number
        // first Arrays.sort(name)
        // than call the method to find missing number or numbers
        int[] nums1 ={1,3,4,6,8};
        int[] nums2 ={2,4,0,7,8,9,10};
        int[] nums3 ={0,1,3};

        // only one missing number
        // (formula = (N * (N+1))/2 )
        int[] nums ={3,0,4,5,1};

        System.out.println("Single: "+findMising(nums));
        findMising22(nums1);
        Arrays.sort(nums2);
        findMising22(nums2);
        Arrays.sort(nums3);
        findMising22(nums3);

    }
    public static int findMising(int[] nums){
        int isNums = nums.length;
        int sum = (isNums * (isNums + 1 ))/2;
        for (int i = 0; i < isNums; i++){
            sum -= nums[i];
        }
            return sum;
    }
    // more than one missing number and the numbers must be sorted before calling findMissing method

    static void findMising22(int[] nums){
        int N = nums.length;
        int diff = nums[0] - 0;
        for (int i = 0; i < N; i++){
            if(nums[i] - i != diff){
                while(diff < nums[i] - i){
                    System.out.println("Multi: "+(i + diff)+ " ");
                    diff++;
                }
            }
        }
    }
}

