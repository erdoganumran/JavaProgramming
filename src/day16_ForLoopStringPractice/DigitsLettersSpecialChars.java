package day16_ForLoopStringPractice;

public class DigitsLettersSpecialChars {
    public static void main(String[] args) {
        String str = "Cydeo12345School! @#$%Wooden Spoon";
        String digits = "";
        String letters = "";
        String specialCh = "";

        for (int i =0; i<= str.length()-1; i++)
        {if (str.charAt(i) <= 'Z' && str.charAt(i)>= 'A' || str.charAt(i) <= 'z' && str.charAt(i)>= 'a')
            letters+= str.charAt(i);
        else if (str.charAt(i) <= '9' && str.charAt(i)>= '1')
            digits+= str.charAt(i);
        else { if (str.charAt(i)!= ' ') specialCh += str.charAt(i);}

        }
        System.out.println("specialCh = " + specialCh);
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);

        }



    }

