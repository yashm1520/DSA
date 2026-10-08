package Array;

public class ProductSelf {
	 public int[] productExceptSelf(int[] nums) {
	        int[] ans =new int[nums.length];
	        ans[0]=1;
	        int rightproduct=1;
	        for(int i=0;i<nums.length-1;i++){
	          ans[i+1]=nums[i]*ans[i];
	        }
	        for(int i=nums.length-1;i>=0;i--){
	            ans[i]=ans[i]*rightproduct;
	            rightproduct*=nums[i];
	        }
	        return ans;
	    }
}
