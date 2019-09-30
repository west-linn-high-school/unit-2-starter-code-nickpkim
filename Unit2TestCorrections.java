public class Unit2TestCorrections{
  public static void main(String[] args){
    String firstName = "Sofia";
    String middleName = "Maria";
    String lastName = "Hernandez";
    String firstInitial = (firstName.substring(0,1));
    String middleInitial = (middleName.substring(0,1));
    String lastInitial = (lastName.substring(0,1));
    System.out.println(firstInitial.toLowerCase()+middleInitial.toLowerCase()+
    lastInitial.toLowerCase());
  }
}
