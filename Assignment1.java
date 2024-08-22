import java.util.Scanner;

public class Assignment1 {

    public static void main(String[] args){
        //Problem 1
        Scanner scan=new Scanner(System.in);
        System.out.println("What is your name?");
        String name=scan.nextLine();
        System.out.println("Welcome to the code, "+name+"!");

        //Problem 2
        System.out.print("Please enter a number: ");
        int num=Integer.valueOf(scan.next());
        System.out.println("That number squared = "+(num*num)+" and cubed = "+(num*num*num)+".");

        //Problem 3
        System.out.print("Please enter your first number grade: ");
        int grade1=Integer.valueOf(scan.next());
        System.out.print("Please enter your second number grade: ");
        int grade2=Integer.valueOf(scan.next());
        System.out.print("Please enter your third number grade: ");
        int grade3=Integer.valueOf(scan.next());

        System.out.println("The average of those scores are: "+((grade1+grade2+grade3)/3));
    }
}
