public class Geometry{
    public static void main(String[] args){
        int sides = 7;
        int radius = 5;
        final double PI = 3.141529;
        System.out.println("A heptagon has "+sides+" sides.");
        System.out.println("A decagon has "+(radius*2)+" sides.");
        System.out.println("A dodecagon has "+(sides+radius)+" sides.");
        System.out.println("The circumference of a circle with a radius of "+5+" is "+(2*PI*radius)+".");
    }
}