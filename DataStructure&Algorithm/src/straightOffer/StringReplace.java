package straightOffer;
/**
 * 
 * @author lsfire
 *将一个string中的空格替换成为%20，时间复杂度为O(n)
 */
public class StringReplace {
	//从后面替代
/*	public static void RepalceBlank(char[] string, int length){
		if(null == string || length == 0){
			return;
		}
		
		int originalLength = 0;
		int numOfSpace = 0;
		int i = 0
		 while(string[i] != '\0'){
			originalLength ++;
			if(string[i] == ' '){
				numOfSpace++;
			}
			i++;
		}
		
		int newLength = originLength + numOfSpace*2;
		if(newLength > length){
			return;
		}
			
		int originIndex = originalLength;
		int newIndex = newLength;
		
		while(originIndex >=0 && newIndex > originIndex){
			if(string[originIndex] == ' '){
				string[newIndex--] = '0';
				String[newIndex--] = '2';
				string[newIndex--] = '%';
			}else{
				string[newIndex--] = string[originIndex];
			}
			originIndex--;
			
		}
	}*/
	
	public static void main(String[] args) {
		char[] a = new char[50]; 
		a[0] = 'a';
		a[1] = 'b';
		a[2] = ' ';
		a[3] = 'd';
		a[4] = ' ';
		a[5] = 'e';
		System.out.println();
	}

}
