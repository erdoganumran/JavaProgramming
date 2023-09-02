package BootCamp.day2;

public class Bookcamp {

    class C{
       public C (int a){
           System.out.println("C");
       }


       class D extends C{
           public D(){
               super(5);
               System.out.println("D");//WILL PRINT C D
           }


           public D(int b){
               this();//will call default constructor// C D
               System.out.println("E");//WILL PRINT C D E
           }




        }








    }
}
