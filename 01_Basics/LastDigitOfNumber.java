import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // code here
        int rev=n%10;
        if(rev<0){
            rev*=-1;
        }
        System.out.println(rev);
    }
}
