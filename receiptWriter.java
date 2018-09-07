
import java.io.*;
import java.util.*;

class ReceiptWriter{

  private static final String FILENAME = "output.txt";

  public static void writeIt(String printJob){

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME, true))) {

      // String printJob = "This is the content to write into file\n";
      bw.write("\n" + printJob);

      // System.out.println("File: " + FILENAME + " overwritten with with new content");

    } catch (IOException e) {

      e.printStackTrace();

    }
  }
}
