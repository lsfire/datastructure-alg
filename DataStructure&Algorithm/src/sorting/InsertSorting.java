package sorting;

public class InsertSorting {

	public static void main(String[] args) {
		Integer[] a = {8,7,6,5,4,19,78,45,3,2};
		insertSort(a);
		SortingUtil.printArray(a);;

	}
	//insertsorting
	public static <T extends Comparable<? super T>> 
	void insertSort(T[] a){
		if(a.length == 0 || a.length == 1){
			return;
		}
		for(int i = 1;i < a.length;i++){
			T temp = a[i];
			int j = i;
			while(j > 0 && temp.compareTo(a[j - 1]) < 0 ){
				a[j] = a[j-1];
				j--;
			}
			a[j] = temp;
		}
	}
	
}
