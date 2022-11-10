package day17_While_DoWhile;

public class deneme2 {
    public static void main(String[] args) {
        String education= "high school";
        String education2 = "";
        if (education.equalsIgnoreCase("high school"))
            education2= "" + education.substring(0, education.indexOf(" ")) + education.substring(education.indexOf(" ") + 1);
        else education2= education;
        System.out.println(education2);
    }
}
