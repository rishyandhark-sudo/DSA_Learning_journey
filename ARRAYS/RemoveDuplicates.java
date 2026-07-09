class Main {

    public static void removeDuplicates(int[] arr) {

        int[] newArr = new int[arr.length];

        int j = 0;

        newArr[j++] = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] != arr[i - 1]) {
                newArr[j++] = arr[i];
            }
        }

        for(int i = 0; i < j; i++) {
            System.out.print(newArr[i] + " ");
        }
    }

    public static void main(String[] args){

        int[] arr = {1,1,2,2,3,4,4};

        removeDuplicates(arr);
    }
}
