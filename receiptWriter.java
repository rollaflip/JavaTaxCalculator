
import java.io.*;

class receiptWriter{

  private static final String FILENAME = "output.txt";

  public void saveIt(String printJob){

    try (BufferedWriter bw = new BufferedWriter(new FileWriter(FILENAME))) {

      // String printJob = "This is the content to write into file\n";

      bw.write(printJob);

      System.out.println("File: " + FILENAME + " overwritten with with new content");

    } catch (IOException e) {

      e.printStackTrace();

    }
  }

    public static void main(String[] args) {

    }
}
