package straightOffer;

public class BitOperation {
	public static void main(String[] args) {
		System.out.println(numberOf1(25535));
	}
	
	public static int numberOf1(int a){
		int flag = 1;
		int count = 0;
		while(flag > 0){
			if((a & flag) !=0){
				count++;
			}
		flag = flag << 1;
		}
		return count;
	}

}
