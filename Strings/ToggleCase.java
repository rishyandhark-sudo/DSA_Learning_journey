class Main {
    public static void main(String[] args) {
     String str="HeLLo";
       String res="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                res+=Character.toLowerCase(ch);
            }
            else if(Character.isLowerCase(ch)){
                res+=Character.toUpperCase(ch);
            }
            else{
                res+=ch;
            }
        }
        
        System.out.print(res);
        
       
    }
}
