public class MyHeap{

private static void swap(int[] arr, int x, int y) {
  // swaps index x with index y
  int temp = arr[x];
  arr[x] = arr[y];
  arr[y] = temp;
}

//We discussed these 2 methods already:
private static void pushDown(int[]data,int size,int index){
	if ((2*index + 1) > size && (2*index + 2) > size){
		return;
	}
	if ((2*index + 2) > size){
		swap(data, index, 2*index+1);	
		return;	
	}
	swap(data, index, Math.min(data[2*index+1], data[2*index+2]));

	pushDown(data, size, Math.min(data[2*index+1], data[2*index+2]));
}
 /*    - size  is the number of elements in the data array. 
     - push the element at index i downward into the correct position. This will swap with the larger of the child nodes provided thatchild is larger. This stops when a leaf is reached, or neither child is larger. [ should be O(logn) ]
     - precondition: index is between 0 and size-1 inclusive
     - precondition: size is between 0 and data.length-1 inclusive.
*/

private static void pushUp(int[]data,int index){
}
 /*    - push the element at index i up into the correct position. This will swap it with the parent node until the parent node is larger or the root is reached. [ should be O(logn) ]
     - precondition: index is between 0 and data.length-1 inclusive.


//We will discuss this today:
*/
public static void heapify(int[]){
}
   // - convert the array into a valid heap. [ should be O(n) ]

public static void heapsort(int[]){
}
 /*   - sort the array [ should be O(nlogn) ] :
     converting it into a heap 
     removing the largest value n-1 times (remove places at end of the sub-array). */
}
