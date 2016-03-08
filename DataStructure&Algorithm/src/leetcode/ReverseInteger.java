package leetcode;
//Reverse digits of an integer.
//
//Example1: x = 123, return 321
//Example2: x = -123, return -321
/**
 * 
 * @author liushao
 *坑在超出java的Integer取值范围
 */
public class ReverseInteger {
	public static void main(String[] args) {
		Solution solution = new Solution();
		System.out.println(solution.reverse(1534236469));
	}
}

class Solution {
    public int reverse(int x) {
    	int res = 0;
        while (x != 0) {
            if ((res*10+x%10-x%10)/10 != res)
                return 0;
            res = res*10 + x%10;
            x /= 10;
        }
        return res;
    }
}

