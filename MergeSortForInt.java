
public class MergeSortForInt {
public static void main(String[] args) {
  int [] a=new int[] {4,4,5,72,2,45,1,8};	
  for(int i:a) {
//		System.out.println(i);
	}
  mergesort(a);
for(int i:a) {
	System.out.println(i);
}
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
	int leftEnd=(leftStart+rightEnd)/2;
	//leftStart
	int rightStart=leftEnd+1;
	//rightEnd
	int size=rightEnd-leftStart-1;
	
	
	int left= leftStart;
	int right=rightStart;
	int index=leftStart;
	
	while(left<=leftEnd && right<=rightEnd) {
		if(array[left]<=array[right]) {
			temp[index]=array[left];
			left++;
		}else {
			temp[index]=array[right];
			right++;
			
		}			index++;

	}
	
	System.arraycopy(array, left, temp, index, leftEnd-left+1);
	System.arraycopy(array, right, temp, index, rightEnd-right+1);
	System.arraycopy(temp, leftStart, array, leftStart	, size);
	
}



}
