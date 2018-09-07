/*
Read: call receiptScanner
  -new ShoppingCart for each input
  -place in ShoppingCart array by order "input"
  -new Product for each line in scan
    -Product main method do math automatically
    -add to receipt array in main
print final receipt
call ReceiptWriter: save to output file
*/

/*
receipt class

*/
import java.io.*;
import java.util.*;

public class Main {

  public static void main (String[] args){
    int totalTax = 0;
    int totalBill = 0;

  ArrayList<String> scannedReceipt = ReceiptScanner.scanIt("input.txt");

  for(String line : scannedReceipt) {

    if(line.contains("Input")){
      // create new shopping cart
      //else shoppingCart.add(new product(line))

      ReceiptWriter.writeIt("Output " + line.split(" ")[1]);
    }else{

      ReceiptWriter.writeIt(line);
    }


  }
  // ReceiptWriter.writeIt(totalTax);
  // ReceiptWriter.writeIt(totalBill);
}

}
