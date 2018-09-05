/*
Read: call receiptScanner
  -place in cart by order
store in temp array
call taxCalc
print final receipt
call ReceiptWriter: save to output file
*/
import java.io.*;
import java.util.*;

public class Main {

  public static void main (String[] args){
  ArrayList<String> stuff = ReceiptScanner.scanIt("input.txt");
  // do computations here on array

  for(String thing : stuff) {
    ReceiptWriter.writeIt(thing);

  }
  }
}
