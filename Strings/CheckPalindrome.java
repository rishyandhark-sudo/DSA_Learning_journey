class Main {

    public static void main(String[] args) {

        String str = "madam";

        int j = str.length() - 1;

        boolean isPalindrome = true;

        for(int i = 0; i < str.length(); i++) {

            if(str.charAt(i) != str.charAt(j--)) {

                isPalindrome = false;
                break;
            }
        }

        if(isPalindrome)
            System.out.println("Palindrome");
        else
            System.out.println("Not a Palindrome");
    }
}
