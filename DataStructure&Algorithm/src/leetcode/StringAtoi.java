package leetcode;

public class StringAtoi {
	
	public static void main(String[] args) {
		System.out.println(myAtoi("-2147483650"));
	}
	
	public static int myAtoi(String str) {
    	if (str.isEmpty()) {
			return 0;
		}
    	str = str.trim();
    	
    	int res = 0,i = 0,sign = 1;
    	if(str.charAt(i) == '-' || str.charAt(i) == '+'){
    		sign = str.charAt(i) == '-'? -1:1;
    		i++;
    	}
    	for(;i < str.length();i++){
    		int temp = str.charAt(i) - '0';
    		if (temp < 0 || temp > 9) break;
    		if(res > Integer.MAX_VALUE / 10 || (res == Integer.MAX_VALUE / 10 && temp > Integer.MAX_VALUE % 10)){
    			return sign == 1? Integer.MAX_VALUE:Integer.MIN_VALUE;
    		}
    		res = res * 10 + temp;
    	}
    	
    	return res*sign;
    }

}
