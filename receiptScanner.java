/*
read
parse for data
  -validate data
  -

store in arr or obj
pass obj to main
*/
import java.io.*;

class receiptScanner {

 private static final String FILENAME = "input.txt";

 public static void main(String[] args) {

  try (
   FileReader fr = new FileReader(FILENAME);
   BufferedReader br = new BufferedReader(fr)
  ){

   String line;

   while ((line = br.readLine()) != null) {
    System.out.println(line);
   }
  } catch (IOException e) {
   e.printStackTrace();
  }
 }
}
