class Main {
    public static void main(String[] args) {
     String str="banana education";
        int a=0;
        int e=0;
        int i=0;
        int o=0;
        int u=0;
        for(int j=0;j<str.length();j++){
           switch(str.charAt(j)){
               case 'a':
                   a++;
                   break;
               case 'e':
                   e++;
                   break;
               case 'i':
                   i++;
                   break;
               case 'o':
                   o++;
                   break;
               case 'u':
                   u++;
                   break;
                  
           }
            
        }
        
        System.out.println("a repeats "+a+" times");
         System.out.println("e repeats "+e+" times");
        System.out.println("i repeats "+i+" times");
         System.out.println("o repeats "+o+" times");
         System.out.println("u repeats "+u+" times");
    }
}
