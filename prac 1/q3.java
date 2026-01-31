import static java.lang.System.out;
import java.util.Scanner;

public class q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        out.print("Ener Credit card no.: ");

        int cardno = sc.nextInt();
        int temp1 = cardno;

        int sum1 = 0;
        for(int i =0; i < String.valueOf(cardno).length();i+=2){
            sum1 += temp1 % 10;
        temp1 /= 100;
        }

        int temp2 = cardno / 10;
        int sum2 = 0;

        for(int i =0; i < String.valueOf(cardno).length();i+=2){
            int value = (temp2 % 10) * 2;
            sum2 += value % 10;
            sum2 += value / 10;
            temp2 /= 100;
        
        }

        if((sum1 + sum2) % 10 == 0){
            System.out.println("The credit card no. is valid.");
        }else{
            System.out.println("The credit card no. is invalid.");
        }


    }
}