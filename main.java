/*
Read: call receiptScanner

store in temp array
call receiptWriter
*/
import java.io.*;
import java.util.*;

public class main {

  public static void main (String[]args){
  ArrayList<String> stuff = receiptScanner.scanIt("input.txt");
  // System.out.println(stuff);

  for(String thing : stuff) {
    receiptWriter.writeIt(thing);

  }
  }
}
