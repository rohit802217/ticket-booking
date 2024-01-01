/**
 * mainClass
 */
import java.util.*;
class ticketBooking{
     String name;
     int tickets;
     double tickets_prices;
     double total;
     public ticketBooking(String name, int tickets, double tickets_prices) {
          this.name = name;
          this.tickets = tickets;
          this.tickets_prices = tickets_prices;
      }
     void calculate(){
          System.out.println("  your total amount ");
           double total=tickets_prices*tickets;
           System.out.println("total:"+total);

     }
     void details(){
          System.out.println(" name:="+name+"\nticket="+tickets+"\nticket_price="+tickets_prices+"\ntotal="+total);

     }

}
public class mainClass {
     public static void main(String[] args) {
          Scanner sc= new Scanner(System.in);
          System.out.println(" enter your name ");
          String name=sc.next();
          System.out.println(" enter your  ticket number ");
          int ticket=sc.nextInt();
          System.out.println(" enter your tickets_price ");
          double tickets_prices=sc.nextDouble();
 

         ticketBooking p1=new ticketBooking(name, ticket, tickets_prices) ;
         p1.calculate();
         p1.details();
         p1.calculate();
     }

     
}