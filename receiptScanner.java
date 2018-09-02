

class InRead{
  public static void main(String[]args){
    try{
      FileReader fr = new FileReader("input.txt");
      BufferedReader br = new BufferedREader(fr);

      String str;
      //do something with data
      br.close();
    } catch (IOException e ){
      out.println("file not found!")
    }
  }
}
