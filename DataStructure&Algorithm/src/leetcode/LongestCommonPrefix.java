package leetcode;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] strings = new String[]{"avc","av","avcfg"};
		System.out.println(longestCommonPrefix(strings));
	}
	    public static String longestCommonPrefix(String[] strs) {
	        if(null == strs || strs.length ==0){
	            return "";
	        }
		        for(String str : strs){
		            if(null == str || str.length() == 0){
		                return "";
		            }
		        }
		        StringBuffer result = new StringBuffer("");
		        for(int i = 0;i < strs[0].length();i++){
		        	for(int j = 1;j < strs.length;j++){
		        		if (i > strs[j].length() - 1) {
							return result.toString();
						}
		        		
		        		if(strs[0].charAt(i) != strs[j].charAt(i)){
		        			return result.toString();
		        		}
		        		
		        	}
	    			result.append(strs[0].charAt(i));
		        }
		        return result.toString();
		    }

}
