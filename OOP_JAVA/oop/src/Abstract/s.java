package Abstract;

public class s {
    public static void main(String[]args){

    }

    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[10];
        for(int i = 0; i <= nums.length; i++){
            if (nums[i] + nums[i+1] == target){
                output[0] = i;
                output[1] = i + 1;
            }
        }
        return output;
    }
}

