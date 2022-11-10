package day14_String;

public class DomainOfTheMail_Substring {
    public static void main(String[] args) {

        String mail = "ugullee@gmail.com";

        /*output 1
        String  domain2 = mail.substring(mail.indexOf("@")+1, mail.lastIndexOf(".")) ;
        System.out.println(domain2);
        2
        System.out.println(mail.substring(mail.indexOf("@")+1, mail.length()-4));

        or     */

        int beginningIndex = mail.indexOf("@")+1;
        int endingIndex = mail.lastIndexOf(".");

        String domain = mail.substring(beginningIndex,endingIndex);

        System.out.println(domain);

        System.out.println("-----------------------------------------------");

        String s1 = "Java is fun, Java is cool, I love Java";

        String s2 = s1.substring(0, 10+1);
        System.out.println(s2);//Java is fun

        int beg = s1.indexOf(", J")+2;
        int end = s1.lastIndexOf(",");
        String s3 = s1.substring(beg, end);

        System.out.println(s3);//Java is fun

        int beg1= s1.lastIndexOf("I");
        String s4= s1.substring(beg1);
        System.out.println(s4);






    }
}
/*

1. Write a program that can gte the domain of the email. ( Assume that a valid email is given)

		Ex:
			email = Cydeo.School@gmail.com

		output:
			gmail


			email = "School.Cydeo@yahoo.com

		output:
			yahoo

 */