import java.util.*;
 
class Vijay {
 //print hello world using the specific random number for the words hello
 //and world. Please see readme.MD for explanation on how this works
   public static void main(String[] args) {
      System.out.println(random(-229985452) + " " + random(-147909649));
   }
 
 //code for converting the random number
   public static String random(int i) {
      Random rm = new Random(i);
      StringBuilder sb = new StringBuilder();
      while (true) {
         int k = rm.nextInt(27);
         if (k == 0)
            break;
         sb.append((char)('`' + k));
      }
      return sb.toString();
   }
}