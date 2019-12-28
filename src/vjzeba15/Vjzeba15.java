package vjzeba15;

public class Vjzeba15 {

    public static void main(String[] args) {
        
      String str = "This is sentence.  This is a question, right? Yes!  It is.";
      String[] wordArray = str.split("[ .,?!]+");
        for (int i = 0; i < wordArray.length; i++) {
            System.out.println(wordArray[i]);
        }
       
        

   

   
        
    }

}
