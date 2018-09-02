



class OutWrite{
    public static void main(String[]args){
      try{
        FileWriter fw = new FileWriter("Credits.txt");
        PrintWriter pw = new PrintWriter(fw);

        pw.println("print working!");

        pw.close();

      } catch (IOExeption e ){
          out.println("ERROR!")

      }
    }
}
