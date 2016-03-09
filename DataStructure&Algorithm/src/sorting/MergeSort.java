package sorting;


public class MergeSort {

	public static void main(String[] args) {
		Integer[] array = {3,4,6,32,12,83,20,12,67};
		mergeSort(array);
		SortingUtil.printArray(array);
	}
	
	public static <T extends Comparable<? super T>> 
	void mergeSort(T[] array){
		T[] tempArray = (T[]) new Comparable[array.length];
		mergeSort(array, tempArray, 0, array.length - 1);
	}
	
	private static <T extends Comparable<? super T>> 
	void mergeSort(T[] array,T[] tempArray,int left,int right){
		if(left < right){
			int center = (left + right) / 2;
			mergeSort(array, tempArray, left, center);
			mergeSort(array, tempArray, center + 1, right);
			merge(array, tempArray, left, center, center + 1, right);
		}
	}
	
	public static <T extends Comparable<? super T>> 
	void merge(T[] array,T[] temp,int leftPos,int leftEnd,
			int rightPos,int rightEnd){
		int tempPos = leftPos;
		int elementNum = leftEnd - leftPos + rightEnd - rightPos + 2;
		while((leftPos <= leftEnd) && (rightPos <= rightEnd)){
			if(array[leftPos].compareTo(array[rightPos]) <= 0){
				temp[tempPos++] = array[leftPos++];
			}else{
				temp[tempPos++] = array[rightPos++];
			}
		}
		
		while(leftPos <= leftEnd){
			temp[tempPos++] = array[leftPos++];
		}
		
		while(rightPos <= rightEnd){
			temp[tempPos++] = array[rightPos++];
		}
		
		for(int i = 0;i < elementNum;i++,rightEnd--){
			array[rightEnd] = temp[rightEnd];
		}
	}

}
