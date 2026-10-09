package HashMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagram {
	 public List<List<String>> groupAnagrams(String[] strs) {
	        HashMap<String,List<String>> ans=new HashMap<>();
	       
	        for(int i=0;i<strs.length;i++){
	        char[] arr = strs[i].toCharArray();
	         Arrays.sort(arr);
	         String sorted = new String(arr);
	         ans.computeIfAbsent(sorted, k -> new ArrayList<>()).add(strs[i]);
	        
	       

	        }
	         List<List<String>> result=new ArrayList<>(ans.values());
	          return result;
	    }
}
