package Day_14.ClassTask;
import java.util.*;
public class Booking {
    public static void main(String[] args) {
        try {
            BookTicket();
        } catch (InvalidAgeException e) {
           // e.printStackTrace();
        }
        try {
            BookTicket();
        } catch (InvalidAgeException ee) {

        }
    }
    public static void BookTicket() throws InvalidAgeException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int Age = sc.nextInt();
        if(Age < 18) {
          throw new InvalidAgeException();
        }else{
            System.out.println("Enter how many Ticket: ");
            int Ticket = sc.nextInt();
            System.out.println(Ticket + " Printed" );
        }
    }
}
class InvalidAgeException extends Exception{
    InvalidAgeException(){
        super("Don't Enter invalid Age");
    }

}
