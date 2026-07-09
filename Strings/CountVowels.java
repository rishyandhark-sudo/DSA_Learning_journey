class Main {
    public static void main(String[] args) {
        int c=0;
        String str = "education"; // reads HELLO
        //vow={'a','e','i','o','u'};
        for(int i = 0; i < str.length(); i++) {
            char s=str.charAt(i);
            if(s=='a'||s=='e'||s=='i'||s=='o'||s=='u'){
                c++;
            }
            
        }
        
        System.out.println(c); 
    }
}
