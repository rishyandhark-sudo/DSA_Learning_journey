class Main {

    public static void rotatingArray(int[] arr) {

        int len = arr.length;

        int last = arr[len - 1];

        for(int i = len - 1; i >= 1; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
    }

    public static void main(String[] args){

        int[] arra = {1,2,3,4,5};

        rotatingArray(arra);

        for(int i = 0; i < arra.length; i++){
            System.out.print(arra[i] + " ");
        }
    }
}
