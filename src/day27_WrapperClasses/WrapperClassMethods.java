package day27_WrapperClasses;

public class WrapperClassMethods {
    public static void main(String[] args) {



        String str="123";
        int num=Integer.parseInt(str);//parseInt value returns me primitive so we assing prim to prim. it's not unboxing or autoboxing
        System.out.println(num+1);//124
        System.out.println(str+1);//1231
        //parse converts string to primitives
        String str2="10.5";
        double num2= Double.parseDouble(str2);// parse returns primitives at the end
        System.out.println(num2+1);//11.5

        int max=Integer.MAX_VALUE;// you are able to reach the max and min numbers in java with max and mix_value method in wrapper class.
        int min=Integer.MIN_VALUE;// VALUE retuns wrapper class at the end

        System.out.println(max);
        System.out.println(min);

        long max2= Long.MAX_VALUE;
        long min2= Long.MIN_VALUE;
        System.out.println(max2);
        System.out.println(min2);

        String s1="trueR";
        boolean r1=Boolean.parseBoolean(s1); //if s1 is anything other than true, it will give me false
        System.out.println(r1);

        System.out.println("---------------------------");

        String s2="123";
        int num3= Integer.valueOf(s2);// it is possible like this but like this one more procces will happen at back,unboxing
        System.out.println(num3+10);//
        Integer num4= Integer.valueOf(s2);//if you don't want any other process, you can use wrapper class like this
        System.out.println(num4);

        String s3="120.5";
        Double d4= Double.valueOf(s3);//Double is a class

        System.out.println(d4);

        System.out.println("-----------------------------------------------");

        //isDigit[();
        char c1='0';
        boolean r2=Character.isDigit(c1);
        System.out.println(r2);//TRUE
        //isLetter()
        boolean r3= Character.isLetter(c1);
        System.out.println(r3);//FALSE
        //isLetterOrDigit-- you can use this for special char
        boolean r4= !Character.isLetterOrDigit(c1);
        System.out.println(r4);//FALSE
        boolean r5=Character.isUpperCase(c1);
        System.out.println(r5);
        boolean r6=Character.isLowerCase(c1);//wrapper class character
        System.out.println(r6);

        String s="ab1cde2efg3hi4";
        int sum=0;
        for (char each : s.toCharArray()) {// first i convert the string to char array
            if(Character.isDigit(each)){// second from wrapper class i call the method isDigit to find out if the char is digit
                sum+=Integer.parseInt(""+each);// if char is digit i wil add it to sum. bit each was char and each char has different value. that is why I convert char to int.
                //and to make the char string i concatinated it with ""; ""+each--> this is a string now
            }
        }
        System.out.println(sum);


    }
}