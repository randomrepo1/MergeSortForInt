
public class MergeSortForInt {
public static void main(String[] args) {
	
	 
}


public static void mergesort(int[] array) {
	mergesort(array,new int[array.length],0, array.length-1);
}


public static void mergesort(int[] array, int[] temp,int leftStart, int rightEnd) {
 	if(leftStart>=rightEnd)
 	{
 		return;
 	}else {
 		int middle=(leftStart+rightEnd)/2;
 		mergesort(array,temp,leftStart,middle);
 		mergesort(array,temp,middle+1,rightEnd);
 		mergeHalves(array,temp,leftStart,rightEnd);
 	}
 	
 	
}


private static void mergeHalves(int[] array, int[] temp,int leftStart, int rightEnd) {
	
}



}
