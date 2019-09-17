import java.util.Scanner;
public class ThreeNumAverage{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);

    System.out.println("Enter 3 numbers:");
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();
    int num3 = scan.nextInt();

    double avg = ((double)(num1+num2+num3))/3;

    System.out.println(avg);
  }
}
