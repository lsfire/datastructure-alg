package sorting;

public class ShellSorting {

	public static void main(String[] args) {
		Integer[] arr = {65,56,32,21,45,34,6,13,4};
		shellSort(arr);
		SortingUtil.printArray(arr);

	}
	//shell sorting the gap maybe better to optimize,see the book
	public static <T extends Comparable<? super T>>
	void shellSort(T[] array){
		
		for(int gap = array.length / 2;gap > 0;gap /=2){
			for(int i = gap;i < array.length;i++){
				T temp = array[i];
				int j = i;
				while((j -gap >= 0) && temp.compareTo(array[j - gap]) < 0){
					array[j] = array[j - gap];
					j = j - gap;
				}
				array[j] = temp;
			}
		}
	}
	
	
	

}
