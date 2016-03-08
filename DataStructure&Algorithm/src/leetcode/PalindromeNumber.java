package leetcode;

public class PalindromeNumber {
	
	public static void main(String[] args) {
		System.out.println(isPalindrome(10022001));
	}
	public static boolean isPalindrome(int x) {
//        boolean res = true;
//        if(x < 0) return false;
//        
//        int i = 0,j = 0;//标记第这个数字的第一位和最后一位
//        int temp = x;
//        int div = 1;
//        while(temp >= 10){
//        	temp = temp / 10;
//        	j++;
//        	div *= 10;
//        }
//        
//        while(j - i >= 0){
//        	int tail = x % 10;//拿到尾部
//        	int head = (x / div) % 10;
//        	
//        	
//        	i++;
//        	j--;
//        	x = x/10;
//        	div = div/100;
//        	
//        	if(head != tail){
//        		res = false;
//        		break;
//        	}
//        }
//        return res;
		if (x < 0)
            return false;
        int y = 0, x1 = 1;
        while (x / x1 != 0) {
            y = y * 10 + x % 10;
            x /= 10;
            x1 *= 10;
        }
        return y < 10 * x ? y == x : y / 10 == x;
    }
}
