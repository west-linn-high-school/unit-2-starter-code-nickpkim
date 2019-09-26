import java.util.Random;
public class PhoneNumber{
  public static void main(String[] args){
    Random rand = new Random();
    int areaDig1 = (int)(Math.random()*8+2);
    int areaDig2 = (int)(Math.random()*9);
    int areaDig3 = (int)(Math.random()*10);
    int exchDig1 = (int)(Math.random()*8+2);
    int exchDig2 = (int)(Math.random()*10);
    int exchDig3 = (int)(Math.random()*10);
    int finalDig1 = (int)(Math.random()*10);
    int finalDig2 = (int)(Math.random()*10);
    int finalDig3 = (int)(Math.random()*10);
    int finalDig4 = (int)(Math.random()*10);
    String phoneNum = new String("("+areaDig1+""+areaDig2+""+areaDig3+") "+
    exchDig1+""+exchDig2+""+exchDig3+" - "+finalDig1+""+finalDig2+""+finalDig3+
    ""+finalDig4);
    System.out.println(phoneNum);
  }
}
