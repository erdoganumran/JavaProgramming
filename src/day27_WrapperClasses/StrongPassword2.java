package day27_WrapperClasses;

public class StrongPassword2 {
    public static void main(String[] args) {
        String  password="cYde0.";
        int upperCase=0;
        int lowerCase=0;
        int digits=0;
        int specialChar=0;

        for (int i = 0; i < password.length(); i++) {
            char each=password.charAt(i);

            if(Character.isUpperCase(each)){
                upperCase++;
            }
            else if(Character.isLowerCase(each)){
                lowerCase++;
            }
            else if(Character.isDigit(each)){
                digits++;
            }
            else{
                specialChar++;
            }
        }
        if(upperCase>=1&&lowerCase>=1&&specialChar>=1&&digits>=1&&password.length()>=8&&!password.contains(" ")){
            System.out.println("Strong password!");
        }else if(password.length()<8||password.contains(" ")){
            System.out.println("Invalid password!");
        }else {
            System.out.println("Weak password!");
        }


    }
}
