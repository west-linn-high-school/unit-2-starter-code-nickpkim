import java.util.Random;
public class RandomNumbers{
  public static void main(String[] args){
    Random rand = new Random();
    //System.out.println("# [0, 9]: " + rand.nextInt(10));
    //int num = rand.nextInt(10);
    //System.out.println(num);
    double val = rand.nextInt(6)+rand.nextDouble();
    //System.out.println(val);
    System.out.println((int)(Math.random()*10));
    System.out.println((int)(Math.random()*10+1));
    System.out.println((int)(Math.random()*15+20));
    System.out.println((int)(Math.random()*20-10));
    System.out.println(Math.random());
    System.out.println((int)(Math.random()*6)+Math.random());
  }
}
