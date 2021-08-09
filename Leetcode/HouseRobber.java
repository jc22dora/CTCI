public class HouseRobber {
    // 7:35
    public int houseRobber(int[] nums) {
        return 1;
    }
    
    public void testHouseRobber() {
        int[] testCaseOne = {1,2,3,1};
        int[] testCaseTwo = {2,7,9,3,1};
        if(houseRobber(testCaseOne) != 4) {
            System.out.println("Test Case One: Failed");
        } 
        if(houseRobber(testCaseTwo) != 12) {
            System.out.println("Test Case Two: Failed");
        } 
    }
    public static void main(String[] args) {
        System.out.println("Hello");
        HouseRobber rob = new HouseRobber();
        rob.testHouseRobber();
    }
}
