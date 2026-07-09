class Solution { 
public static void pushZerosToEnd(int[] arr) {
// code here
int c=0; 
for(int i=0;i<arr.length;i++){
if(arr[i]!=0){
arr[c++]=arr[i];
} 
}
for(int i=c;i<arr.length;i++){
arr[i]=0;
}
  }
public static void main(String[] args){
int[] arra = {1,2,0,4,3,0,5,0}; 
pushZerosToEnd(arra);
for(int i=0;i<arra.length;i++){
System.out.print(arra[i]); 
}
}
}
