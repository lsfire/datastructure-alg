package sorting;


public class QuickSort {

	public static void main(String[] args) {
		Integer[] array = {12,1,4,5,7,8,10,13,17,43,65};
		quickSort(array);
		SortingUtil.printArray(array);
	}
	
	public static <T extends Comparable<? super T>>
	void quickSort(T[] array){
		quickSort(array,0,array.length - 1);
	}
	
	private static  <T extends Comparable<? super T>>
	void quickSort(T[] array,int left,int right){
		if (left < right) {
			T pivot = array[left];
			int i = left, j = right + 1;
			for (;;) {
				//move to the postion that bigger than ivot
				while (i < right && array[++i].compareTo(pivot) < 0) {
				}
				// move to the position that smaller than pivot
				while (j > left && array[--j].compareTo(pivot) > 0) {
				}

				if (i < j) {
					swapElement(array, i, j);
				} else {
					break;
				}
			}
			swapElement(array, j, left);//restore pivot
			quickSort(array, left, i - 1);//recursion smaller part
			quickSort(array, i + 1, right);//recursion larger part
		}
		
		
	}
	//select the pivot from three element and put the element to the tail
	private static <T extends Comparable<? super T>>
	T median3(T[] array,int left,int right){
		int center = (left + right) / 2;
		//左边的比右边的大
		if(array[left].compareTo(array[center]) > 0){
			swapElement(array, left, center);
		}
		if(array[right].compareTo(array[center]) < 0){
			swapElement(array, center, right);
		}
		
		if(array[right].compareTo(array[left]) < 0){
			swapElement(array, left, right);
		}
		//place pivot at position right
		swapElement(array, center, right - 1 );
		return array[right - 1 ];
	}
	
	private static <T extends Comparable<? super T>>
	void swapElement(T[] array,int pos1,int pos2){
		T temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

}
