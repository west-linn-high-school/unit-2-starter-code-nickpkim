import java.util.Scanner;
public class Store{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    //declaring all magic numbers
    final double PEANUT_PRICE = 1.72;
    final double BOOK_PRICE = 9.00;
    final double MOVIE_PRICE = 13.97;
    final double BOOK_SHIPPING = 0.95;
    final double MOVIE_SHIPPING = 0.04;
    final double PEANUT_SHIPPING = 0.30;
    final double SALES_TAX = 0.072;
    final String storeName= new String("Steve's SuperStore");

    //welcome display
    System.out.println("Welcome to "+storeName);

    //asking and recieving number of each item
    System.out.println("Please enter the number of books:");
        int bookNum = scan.nextInt();
    System.out.println("Please enter the number of movies:");
        int movieNum = scan.nextInt();
    System.out.println("Please enter the number of pounds of peanuts;");
    double peanutNum = scan.nextDouble();

    //Subtotals
    double bookSubtotal = bookNum*BOOK_PRICE;
    System.out.println("bookSub: "+bookSubtotal);
    double movieSubtotal = movieNum*MOVIE_PRICE;
    System.out.println("movieSub: "+movieSubtotal);
    double peanutSubtotal = peanutNum*PEANUT_PRICE;
    System.out.println("peanutSub: "+peanutSubtotal);
    double subtotal = bookSubtotal+movieSubtotal+peanutSubtotal;
    System.out.println("Sub: "+subtotal);

    //shipping cost
    double shipping = (bookNum*BOOK_SHIPPING)+(movieSubtotal*MOVIE_SHIPPING)+
    (peanutNum*PEANUT_SHIPPING);
    System.out.println("ship: "+shipping);

    //sales tax
    double tax = (bookSubtotal+movieSubtotal)*SALES_TAX;
    System.out.println("tax: "+tax);

    //grand total
    double total = Math.round((subtotal+shipping+tax)*100)/100;
    System.out.println("total: "+total);
  }
}
