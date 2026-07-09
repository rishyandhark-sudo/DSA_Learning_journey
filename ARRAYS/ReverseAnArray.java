class Solution {
  public static int[] reverseArray(int arr[]) {
    
    int j= arr.length-1;
    for(int i=0;i<arr.length/2;i++)
    { 
      int temp=arr[i];
      arr[i]=arr[j];
      arr[j]=temp; 
      j--;
    }
    return arr;
  } 
  public static void main(String[] args){ 
    int[] arra={1,2,3,4,5}; 
    reverseArray(arra);
  } 
}
