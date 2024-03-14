import java.util.Scanner;
public class student_grade_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("------STUDENT GRADE CALCULATOR------");
        System.out.print("\n\nEnter the Name of the Student: ");
        String a=sc.nextLine();
        System.out.print("Enter Total Number of Subjects: ");
        int n=sc.nextInt();
        int total=0;
        for(int i=0;i<n;i++){
            System.out.print("Enter Marks Obtained in subject "+(i+1)+": ");
            int m=sc.nextInt();
            total+=m;
        }
        double avg=(double)total/n;
        char grade;
        if(avg>=90){
            grade='O';
        }
        else if(avg>=80){
            grade='A';
        }
        else if(avg>=70){
            grade='B';
        }
        else if(avg>=60){
            grade='C';
        }
        else if(avg>=50){
            grade='D';
        }
        else if(avg>=40){
            grade='E';
        }
        else{
            grade='F';
        }
        System.out.print("\n\nCONGRATULATIONS "+a+" !!!!");
        System.out.println("\n\nTotal Marks Scored: "+total);
        System.out.println("Average Percentage Gained: "+avg+"%");
        System.out.println("Grade: "+grade);
    }
}
