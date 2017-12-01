import java.util.Arrays;
class TwoSum{

	public int[] findTwoSums(int[] nums, int target){
		int[] result = {0,0};
		for(int i = 1; i< nums.length; i++){
			for(int j=0; j<i; j++){
				if(nums[i]+nums[j] == target){
					result[0] = j;
					result[1] = i;
					break;
				}
			}
		}
		return result;
		
	}
	
	public static void main(String[] args){
		TwoSum t =new TwoSum();
		int[] nums = {2, 7, 11, 15};
		System.out.println(Arrays.toString(t.findTwoSums(nums, 18)));
	}
}
