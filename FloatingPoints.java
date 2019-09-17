import java.util.Scanner;
public class FloatingPoints{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int num1 = scan.nextInt();
    int num2 = scan.nextInt();

    System.out.println(num1+" and "+num2);

    double sum = (num1+num2);
    double diff = (num1-num2);
    double prod = (num1*num2);
    double quot = (num1/num2);

    System.out.println(sum);
    System.out.println(diff);
    System.out.println(prod);
    System.out.println(quot);
  }
}
