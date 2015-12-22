import java.util.Scanner;

public class SecondJavaProgram{
  public static void main(String[] args){
    Scanner in = new Scanner(System.in);
    System.out.println("What is your favourite number");
    int favNumber = in.nextInt(); // My favourite is 9
    System.out.println("Your favourite number is :"+favNumber);
    in.close();
  }
}