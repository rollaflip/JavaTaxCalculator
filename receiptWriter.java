
import java.io.*;
import java.util.*;

class receiptWriter{

  private static final String FILENAME = "output.txt";

  public static void writeIt(String printJob){

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

      // String printJob = "This is the content to write into file\n";

      bw.write(printJob);

      System.out.println("File: " + FILENAME + " overwritten with with new content");

    } catch (IOException e) {

      e.printStackTrace();

    }
  }
}
