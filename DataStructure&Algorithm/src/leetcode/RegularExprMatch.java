package leetcode;

public class RegularExprMatch {
	
	public static void main(String[] args) {
		System.out.println(isMatch("dcccaaaa","c*a*"));	
		
}

	public static boolean isMatch(String s, String p) {
		if (s == null || p == null) {
			return false;
		}
		int m = s.length();
		int n = p.length();
		boolean[][] match = new boolean[m + 1][n + 1];
		match[0][0] = true;
		for (int j = 1; j <= n; j++) {  // initialize 1st row, match p with empty s
            if (j % 2 == 0) {
                if (p.charAt(j - 1) == '*') {
                    match[0][j] = true;
                } else {
                    break;
                }
            } 
        }
		
		for(int i = 1;i <=m;i++){
			for(int j = 1;j <=n;j++){
				if(p.charAt(j - 1) != '.' && p.charAt(j - 1) != '*'){//P[j-1]为普通字符
					match[i][j] = match[i - 1][j - 1] && (p.charAt(j-1) == s.charAt(i - 1));
				}else if (p.charAt(j - 1) == '.') {//P[j -1]为'.'
					match[i][j] = match[i - 1][j - 1];
				}else {//p[j -1] 为‘*’
					match[i][j] = match[i][j-2]|| match[i][j-1]||//可能匹配0个 一个或多个
							((p.charAt(j -2 ) == s.charAt(i -1) || p.charAt(j -2 ) == '.') && match[i - 1][j]);
				}
			}
		}
		
		return match[m][n];
	}
	

}
