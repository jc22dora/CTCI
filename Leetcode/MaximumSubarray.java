public class MaximumSubarray {
    public int maxSubArray(int[] nums) {

        // Works but does not meet memory complexity
        int length = nums.length;
        int[] runningSum = new int[length];
        int[][] matrix = new int[length][length];
        runningSum[0] = nums[0];
        int max = runningSum[0];
        for(int i = 1;i<length;i++) {
            runningSum[i] = runningSum[i-1]+nums[i];
        }
        for(int subarray = 0;subarray<length;subarray++) {
            for(int col = subarray;col<length;col++) {
                if(col < subarray ) {
                    matrix[subarray][col] = 0;
                }
                if(col == subarray) {
                    matrix[subarray][col] = runningSum[col];
                }
                if(col > subarray) {
                    matrix[subarray][col] = runningSum[col]-runningSum[col-subarray-1];
                }
                if(matrix[subarray][col] > max) {
                    max = matrix[subarray][col];
                }

            }
        }
        return max;
    }

    public int maxSubArrayTwo(int[] nums) {

        // LC Accepted
        int length = nums.length;
        int[] runningSum = new int[length];
        runningSum[0] = nums[0];
        int max = runningSum[0];
        int currSum = runningSum[0];
        for(int i = 1;i<length;i++) {
            runningSum[i] = runningSum[i-1]+nums[i];
        }
        for(int subarray = 0;subarray<length;subarray++) {
            for(int col = subarray;col<length;col++) {
                if(col < subarray ) {
                    currSum = 0;
                }
                if(col == subarray) {
                    currSum = runningSum[col];
                }
                if(col > subarray) {
                    currSum = runningSum[col]-runningSum[col-subarray-1];
                }
                if(currSum > max) {
                    max = currSum;
                }

            }
        }
        return max;
    }


    public void testMaxSubArray() {
        int[] testCaseOne = {-2,1,-3,4,-1,2,1,-5,4}; // 6
        int[] testCaseTwo = {5,4,-1,7,8}; // 23
        int[] testCaseThree = {1}; // 1
        int[] testCaseFour = {0,1,2,3,4}; // 10

        if(maxSubArrayTwo(testCaseOne) != 6) {
            System.out.println("Case One: Failed");
        }
        if(maxSubArrayTwo(testCaseTwo) != 23) {
            System.out.println("Case Two: Failed");
        }
        if(maxSubArrayTwo(testCaseThree) != 1) {
            System.out.println("Case Three: Failed");
        }
        if(maxSubArrayTwo(testCaseFour) != 10) {
            System.out.println("Case Four: Failed");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello");
        MaximumSubarray max = new MaximumSubarray();
        max.testMaxSubArray();
    }
    
}
