import static java.lang.System.out;
import java.util.Scanner;

public class q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out.print("Enter name: ");

        String name = sc.nextLine();

         out.print("How many subjects you have in this semester:");

         int subjects = sc.nextInt();

         sc.nextLine();

         out.print("What is the programme that you’re currently studying?");


         String programme = sc.nextLine();
         out.println();

         out.println("Welcome " + name  + " from " + programme +"!");

         out.printf("Good luck in all %d courses you have in this semester!\n",subjects);

         sc.close();

    }
}