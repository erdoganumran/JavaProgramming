package day11_Switch_Scanner;

public class Browsers {
    public static void main(String[] args) {
         String browserName = "firefox";

         String name = "";
         boolean validBrowser = browserName =="chrome" || browserName=="firefox" || browserName=="opera"||browserName=="safari"||browserName=="edge";
         if (validBrowser)
         {System.out.println(browserName+ " browser is selected");}
        else {
            System.out.println("Invalid browser name");}

    }
}
 /*
 	1. Create a class called Browser. Write a program that can display the name of selected browser
	        1. declear a String variable named browserName
	        2. Assume that the valid browsers are: chrome, firefox, opera, safari, edge
	        3. if the browser name does not match with the valid browsers' names,
	        out put should be: Invalid Browser Name

	        Ex:
	        	String browser = "chrome";

	    	Output:
	    		Chrome Browser is selected

			Note: MUST use nested if

	2. Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
  */