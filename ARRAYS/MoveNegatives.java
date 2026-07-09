class Main {

    public static void moveNegatives(int[] arr) {
        int c=0;
           int[] newArr = new int[arr.length];
for(int i=0;i<arr.length;i++){
    if(arr[i]<0){
        newArr[c++]=arr[i];
    }
}
        for(int l=0;l<arr.length;l++){
    if(arr[l]>0){
        newArr[c++]=arr[l];
    }
}
        for(int m=0;m<newArr.length;m++){
   System.out.print(newArr[m]+" ");
}
       
    }

    public static void main(String[] args){
int[] arra={1 ,-2 ,3 ,-4 ,5 ,-6};
      moveNegatives(arra); 
    }
}
