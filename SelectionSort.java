public class SelectionSort {
  public int[] selectionSort(int[] array) {
  // corner case check
  if (array == null || array.length <= 1) {
    return array;
  }
  for (int i = 0; i < array.length - 1; i++) {
    int min = i;
    for (int j = i + 1; j < array.length; j++) {
      if (array[j] < array[min]) {
        min = j;
      }
    }
    swap(array, i, min);
  }
  return array;
  }
  
  public void swap(int[] array, int left, int right) {
    int temp = array[left];
    array[left] = array[right];
    array[right] = temp;
  }
  
  public static void main(String[] args) {
    SelectionSort solution = new SelectionSort();
    
    int[] array = null;
    array = solution.selectionSort(array);
    System.out.println(Arrays.toString(array));
    
    array[] = new int[] {0,3,2,-7,5,9,4,5,3}
    array = solution.selectionSort(array);
    System.out.println(Arrays.toString(array));
  }
}
// Time: O(n^2) -- two for loops: n*n
// Space: O(1) additional space used
