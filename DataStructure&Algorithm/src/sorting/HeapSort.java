package sorting;

public class HeapSort {
	public static void main(String args[]){
		Integer[] array = {34,32,43,65,45,67,25,12};
		heapSort(array);
		SortingUtil.printArray(array);
	}
	
	public static <T extends Comparable<? super T>>
	void heapSort(T[] array){
		//假设传入的数组是一个堆（array[i]的子节点是array[2*i + 1]和array[2*i + 2]）,将其调整为
		//最大堆，起始调整的节点是最后一个元素的父节点
		for(int i = array.length/2;i >= 0;i--){//调整堆
			percDown(array, i, array.length);
		}
		
		for(int i = array.length - 1;i > 0;i--){
			swapElement(array, 0, i);//将第一个数（即最大值放入堆尾）
			percDown(array, 0, i);//根节点删除后从根节点下滤
		}
		
		
	}
	
	/**
	 * 下滤，如果父节点小于子节点则交换
	 * @param array 
	 * @param i
	 * @param n
	 */
	public static <T extends Comparable<? super T>>
	void percDown(T[] array,int i,int n){
		T temp ;//temp保存节点的值
		int child;
		for(temp = array[i];2*i + 1 < n; i = child){
			child = 2 * i + 1;
			//左节点小于右节点，
			if(child != n - 1 && array[child].compareTo(array[child +1 ]) < 0){
				child++;
			}
			//父节点比子节点小
			if(temp.compareTo(array[child]) < 0){
				array[i] = array[child];
			}else{
				break;
			}
			
		}
		array[i] = temp;
	}
	/**
	 * 
	 * @param array
	 * @param pos1
	 * @param pos2
	 */
	public static <T extends Comparable<? super T>>
	void swapElement(T[] array,int pos1,int pos2){
		T temp = array[pos1];
		array[pos1] = array[pos2];
		array[pos2] = temp;
	}

}
