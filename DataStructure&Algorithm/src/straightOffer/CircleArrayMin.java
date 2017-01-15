package straightOffer;
/**
 * 
 * @author lsfire
 *在旋转有序的数组中找到最小值，时间O(logn)
 */
public class CircleArrayMin {

	public static int findMin(int[] array,int length){
		
		int index1 = 0;
		int index2 = length - 1;
		if(array[index2] > array[index1]){
			return array[0];
		}
		if(index1 == index2){
			return array[0];
		}
		int indexMid = index1;
		
		while(index1 != index2 - 1 ){
			indexMid = (index1 + index2)/2;
			if(array[indexMid] >= array[index1]){
				index1 = indexMid;
			}if(array[indexMid] <= array[index2]){
				index2 = indexMid;
			}
		}
		
		return array[index2];
	}
	
	public static void main(String[] args) {
		int[] array = new int[]{2,3,4,5,6};
		System.out.println(findMin(array, 5));
	}

}
