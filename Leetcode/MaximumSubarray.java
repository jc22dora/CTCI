public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        // 4:54
        int length = nums.length;
        int[] runningSum = new int[length];
        int[][] matrix = new int[length][length];
        runningSum[0] = nums[0];
        int max = runningSum[0];
        for(int i = 1;i<length;i++) {
            runningSum[i] += nums[i];
        }
        for(int subarray = 0;subarray<length;subarray++) {
            for(int col = subarray;col<length;col++) {
                if(col < subarray ) {
                    
                }

            }
        }
        return max;
    }

    public void testMaxSubArray() {
        int[] testCaseOne = {-2,1,-3,4,-1,2,1,-5,4}; // 6
        int[] testCaseTwo = {5,4,-1,7,8}; // 23
        int[] testCaseThree = {1}; // 1
        
        if(maxSubArray(testCaseOne) != 6) {
            System.out.println("Case One: Failed");
        }
        if(maxSubArray(testCaseTwo) != 23) {
            System.out.println("Case Two: Failed");
        }
        if(maxSubArray(testCaseThree) != 1) {
            System.out.println("Case Three: Failed");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        MaximumSubarray max = new MaximumSubarray();
        max.testMaxSubArray();
    }
    
}
