package Day45_Exceptions;

public class TryCatch2 {
    public static void main(String[] args) {
         int[]nums= {36,6,34,12};
        System.out.println(nums[0]);//36

        try{
            System.out.println(nums[6]);
        }catch (Exception e){
            System.out.println("Wrong index");
            e.printStackTrace();//full message end of the print
            System.out.println(e.getMessage());//Index 6 out of bounds for length 4
        }
        System.out.println(nums[3]);//12

        try {
            int j= 100;
            int n=j/0;

        }catch (ArithmeticException a){// all exceptions come from exception class instead of ArithmeticException, you can put Exception
            System.out.println(a.getMessage());//    / by zero
        }
    }
}
