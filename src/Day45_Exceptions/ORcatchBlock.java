package Day45_Exceptions;

public class ORcatchBlock {
    public static void main(String[] args) {


     try {
         System.out.println(4 / 0);

         String str = null;
         System.out.println(str.toUpperCase());

         int[] n = {10, 4};
         System.out.println(n[2]);
     }catch (IllegalArgumentException | NullPointerException e){
         //exception types can not be sub-parent types
        }





     }
    }
