// Online Java Compiler (Editor)
// Write and run Java online using this editor.BCABC
import java.util.Scanner;
import java.util.ArrayList;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int score=0;
        ArrayList<Character> a = new ArrayList<>();
        ArrayList<Character> q = new ArrayList<>();
        char s;
        a.add('B');
        a.add('c');
        a.add('A');
        a.add('B');
        a.add('c');
        System.out.println("----Quiz Application----");
        System.out.println("Answer the all below questions:");
        System.out.println("1. Which language runs on the JVM?"+"\n"+
                           " A) C B) Java C) HTML D) CSS");
        s=sc.next().charAt(0);
        q.add(s);
        System.out.println("2. What is 10 + 20?"+"\n"+" A) 10 B) 20 C) 30 D) 40");
        s=sc.next().charAt(0);
        q.add(s);
        System.out.println("3. Which is a valid array declaration type in Java?"+"\n"+" A) int[] B) integer C) num D) arrayint");
        s=sc.next().charAt(0);
        q.add(s);
        System.out.println("4. Which loop executes while a condition is true?"+"\n"+" A) if B) while C) switch D) class");
        s=sc.next().charAt(0);
        q.add(s);
        System.out.println("5. Which keyword creates an object?"+"\n"+" A) class B) void C) new D) static");
        s=sc.next().charAt(0);
        q.add(s);
        System.out.println("Calculating your score:");
        for(int i=0;i<5;i++){
            if(Character.toUpperCase(a.get(i)) == Character.toUpperCase(q.get(i))){
                score++;
            }
        }
        System.out.println(score);
    }
}
