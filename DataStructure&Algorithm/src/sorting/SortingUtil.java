package sorting;

public class SortingUtil {
	public static <T extends Comparable<? super T>>
	void printArray(T[] array){
		for(int i = 0;i < array.length;i++){
			System.out.print(array[i] + "\t");
			
		}
		System.out.println();
	}

}
