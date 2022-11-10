package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch= '@';

        if (ch>=0 || ch>=9)
        {System.out.println("Digit");}
        else if ( (ch>='a' && ch<='z' ) || (ch>='A' || ch<='Z'))
        {System.out.println("Alphabetic");}
        else
        {System.out.println("Special character");}

    }
}

/*
Create a class called Character Identity, and write a program that can
identify if the given character is a digit or Alphabetic Character(A~Z
or a~Z) or a special character
Ex:
ch = '@'
output:
Special Character
 */