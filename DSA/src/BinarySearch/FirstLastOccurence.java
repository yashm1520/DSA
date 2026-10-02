package BinarySearch;

public class FirstLastOccurence {
	  public int[] searchRange(int[] nums, int target) {
	        int first=findFirst(nums,target);
	         int last=findLast(nums,target);
	      return new int[]{first,last};
	            
	        }
	        public int findFirst(int[] arr,int n) {
			int mid=0;
			int low=0;
			int high=arr.length-1;
			int ans=-1;
			
			while(low<=high) {
				mid=(low+high)/2;
				if(arr[mid]==n) {
				//	ans=mid;
					high=mid-1;
					
				}
				else if(arr[mid]<n) {
					
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
			return ans;
			
			
			
		}
		public int findLast(int[] arr,int n) {
			//
			int low=0;
			int high=arr.length-1;
			int ans=-1;
			
			while(low<=high) {
				int mid=(low+high)/2;
				if(arr[mid]==n) {
					ans=mid;
					low=mid+1;
					
				}
				else if(arr[mid]<n) {
					
					low=mid+1;
				}else {
					high=mid-1;
				}
			}
			return ans;
			
		}
}
