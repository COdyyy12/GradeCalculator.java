import java.util.Scanner;
public class GradeCalculator {
     public static void main(String[] args) {
    Scanner a = new Scanner(System.in);
    int n = a.nextInt();
    if(n==0)
    {
        System.out.println("invalid input");
        return;
    }
    int sumPA=0;
    for(int i=0;i<n;i++)
    {
        int pa=a.nextInt();
        if(pa<0||pa>100)
        {
            System.out.println("invalid input");
            return;
        }
        sumPA=sumPA+pa;
    }
    int Midterm=a.nextInt();
    int Final=a.nextInt();
    { if (Midterm < 0 || Midterm > 100 || Final< 0 || Final > 100)
         {
            System.out.println("invalid input");
            return;
         }
    }
      double avg = (double) sumPA / n;
      double GPA = avg * 0.50+ Midterm * 0.125+ Final * 0.375;
      System.out.println(GPA);
   { if (GPA >= 90) {
            System.out.println("A");
        } else if (GPA >= 80) {
            System.out.println("B");
        } else if (GPA >= 70) {
            System.out.println("C");
        } else if (GPA >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
     }
    }
