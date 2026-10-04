package Interval;

import java.util.ArrayList;
import java.util.List;

public class SummaryRange {
	
	    public List<String> summaryRanges(int[] nums) {
	        List<String> ans=new ArrayList<>();
	        if(nums.length==0){
	            return ans;
	        }
	       int i=0;
	       int j=0;
	       while(j+1<nums.length){
	        if(nums[j]+1!=nums[j+1]){
	            if(i==j){
	                ans.add(Integer.toString(nums[i]));
	            }else{
	                ans.add(Integer.toString(nums[i])+"->"+Integer.toString(nums[j]));
	                
	            }
	             i=j+1;
	           
	        }
	        j++;
	       }
	       if(i==j){
	        ans.add(Integer.toString(nums[i]));
	       }else{
	           ans.add(Integer.toString(nums[i])+"->"+Integer.toString(nums[j]));
	       }
	       return ans;
	    }
	}

