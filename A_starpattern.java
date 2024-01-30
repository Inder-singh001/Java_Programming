import java.util.Scanner;

public class A_starpattern{
  public static void main(String[] args) {
    Scanner star = new Scanner (System.in);
    System.out.println("Enter no. of rows: ");
    int rows = star.nextInt();
    for (int i = 0; i < rows; i++){
      for (int j = rows; j > i; j--){
        System.out.print(" ");
      }
      for (int k = 0; k <= i; k++){
        System.out.print("* ");
      }
      System.out.println();
    } 
  }
}
