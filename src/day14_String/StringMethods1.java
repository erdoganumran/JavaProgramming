package day14_String;

public class StringMethods1 {
    public static void main(String[] args) {

        String str1 = "    batch 25       "; //trim(): returns new String without the white spaces (unused spaces)
        str1= str1.trim();
        System.out.println(str1.trim());//batch 25
        System.out.println(str1);//batch 25

        //	indexOf(str): returns the index number of first occurred character. returns int
        //	lastIndexOf(str): returns the index number of last occurred character. returns int

        String str2 = "Cydeo School";//starts from 0
        System.out.println(str2.indexOf("h"));//8
        System.out.println(str2.indexOf("o"));//4 because starts reading from the left side
        System.out.println(str2.indexOf("ool"));//9 should be more spesific

        System.out.println("------------------------------------------------");

        String s = "Java Nova Cava Wawa orange";
        int s1 = s.indexOf("a");
        int s2 = s.indexOf("a N");
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);//4
        int s3= s.indexOf("a C");//8
        System.out.println("s3 = " + s3);

        int s4 = s.indexOf("Ca") +1;// because of after the C THAT IS WHY WE ADD 1
        System.out.println("s4 = " + s4);

        int s5= s.indexOf("a W");
        System.out.println("s5 = " + s5);//13
        int s6= s.indexOf("aw");
        System.out.println("s6 = " + s6);
        int s7= s.indexOf("a o");
        System.out.println("s7 = " + s7);
        
        int s8= s.lastIndexOf("a W");
        System.out.println("s8 = " + s8);

        int s9= s.lastIndexOf("a");
        System.out.println("s9 = " + s9);//22

        int s10= s.lastIndexOf("o");//20
        System.out.println("s10 = " + s10);//returns the index number of last occurred character. returns int

        int s11 = s.lastIndexOf("or");//returns the index number of last occurred character. returns int
        System.out.println("s11 = " + s11);//20
        
        int s12 = s.indexOf("or");
        System.out.println("s12 = " + s12);//20







    }
}
