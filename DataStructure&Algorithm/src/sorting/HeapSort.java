package sorting;

public class HeapSort {
	public static void main(String args[]){
		Integer[] array = {34,32,43,65,45,67,25,12};
		heapSort(array);
		SortingUtil.printArray(array);
	}
	
	public static <T extends Comparable<? super T>>
	void heapSort(T[] array){
		//���贫���������һ���ѣ�array[i]���ӽڵ���array[2*i + 1]��array[2*i + 2]��,�������Ϊ
		//���ѣ���ʼ�����Ľڵ������һ��Ԫ�صĸ��ڵ�
		for(int i = array.length/2;i >= 0;i--){//������
			percDown(array, i, array.length);
		}
		
		for(int i = array.length - 1;i > 0;i--){
			swapElement(array, 0, i);//����һ�����������ֵ�����β��
			percDown(array, 0, i);//���ڵ�ɾ����Ӹ��ڵ�����
		}
		
		
	}
	
	/**
	 * ���ˣ�������ڵ�С���ӽڵ��򽻻�
	 * @param array 
	 * @param i
	 * @param n
	 */
	public static <T extends Comparable<? super T>>
	void percDown(T[] array,int i,int n){
		T temp ;//temp����ڵ��ֵ
		int child;
		for(temp = array[i];2*i + 1 < n; i = child){
			child = 2 * i + 1;
			//��ڵ�С���ҽڵ㣬
			if(child != n - 1 && array[child].compareTo(array[child +1 ]) < 0){
				child++;
			}
			//���ڵ���ӽڵ�С
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
