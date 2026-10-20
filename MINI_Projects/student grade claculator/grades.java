import java.util.Scanner;

class Grades{
    void calcgrades(int a[][]){
       int n=a.length;
        int m=a[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print("Student "+(i+1)+" subject "+(j+1));
                if(a[i][j]>=90)
                    System.out.println("Grade is A");
                else if(a[i][j]>=80)
                    System.out.println("Grade is B");
                else if(a[i][j]>=70)
                    System.out.println("Grade is C");
                else if(a[i][j]>=60)
                    System.out.println("Grade is D");
                else if(a[i][j]>=50)
                    System.out.println("Grade is E");
                else 
                    System.out.println("Fail");
            }
        }
    }
}
class Main{
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter no: of students:");
        int n=sc.nextInt();
        System.out.print("Enter no:of subjects: ");
        int s=sc.nextInt();
        int a[][] = new int[n][s];
        for(int i=0;i<n;i++){
            for(int j=0;j<s;j++){
                System.out.print("Enter student "+(i+1)+" subject "+(j+1)+" marks: ");
                a[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<s;j++){
                System.out.println("student "+(i+1)+" subject "+(j+1)+" marks are: "+a[i][j]);
            }
        }
Grades g=new Grades();
        g.calcgrades(a);
        
    }
}
