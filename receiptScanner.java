/*
read
parse for data
  -validate data
  -

store in arr or obj
pass obj to main
*/
import java.io.*;
import java.util.*;

public class ReceiptScanner{

//  private static final String FILENAME = "input.txt";

public static ArrayList<String> scanIt(String FILENAME) {
  ArrayList<String> bill = new ArrayList<String>();

  try (
   FileReader fr = new FileReader(FILENAME);
   BufferedReader br = new BufferedReader(fr);
  ){

   String line;

   while ((line = br.readLine()) != null) {
    // System.out.println(line);
    bill.add(line);
   }

  //  System.out.println(bill);
  } catch (IOException e) {
    e.printStackTrace();
  }
  return bill;
 }
}
