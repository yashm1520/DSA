package Stack;

import java.util.Stack;

public class SimplifyPath {
	 public String simplifyPath(String path) {
	     Stack<String> ans=new Stack<>();

	     for(String str:path.split("/")){
	      if(str.equals("") || str.equals(".")){
	        continue;
	      }else if(str.equals("..")){
	        if(!ans.isEmpty()){
	        ans.pop();
	        }
	      }else{
	        ans.push(str);
	      }
	     }
	StringBuilder result = new StringBuilder();

	for (String value : ans) {
	    result.append("/").append(value);
	}

	path = result.length() == 0 ? "/" : result.toString();

	     
	     return path;

	      
	    }
}
