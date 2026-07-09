class Max {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int l = arr[0];

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] < l) {
                l = arr[i];
            }
        }

        System.out.println("Smallest one is " + l);
    }
}
