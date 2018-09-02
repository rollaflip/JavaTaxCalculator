import java.util.Scanner

/*
sales tax on all goods: 10%
good exempt from tax: books, food, medical products unless imported
all imports additional tax: 5%

prices include tax already

rev tax formula: line item / tax

big decimal is more accurate than double
*/

public class SalesTax{
  public static void main (String[]args){
    Scanner input = new Scanner(System.in);

    System.out.print("enter purch amount");
    double purchaseAmount = input.nextDouble();
    double tax = purchaseAmount * 0.06;

    System.out.println("Sales tax is $")

  }

}
