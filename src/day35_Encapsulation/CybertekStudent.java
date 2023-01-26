package day35_Encapsulation;

public class CybertekStudent {

    public String name, fieldOfStudy;
    public char gender;
    public int age, groupNumber;
    public static String schoolName, programmingLanguage , secretCode;

    static {
        schoolName="Cydeo";
        programmingLanguage="Java";
        secretCode="Wooden Spoon";
    }

    public CybertekStudent(String name, String fieldOfStudy, String programmingLanguage, String secretCode, char gender, int age, int groupNumber) {
        this.name = name;
        this.fieldOfStudy = fieldOfStudy;
        this.programmingLanguage = programmingLanguage;
        this.secretCode = secretCode;
        this.gender = gender;
        this.age = age;
        this.groupNumber = groupNumber;
    }
    public static void printSchoolName(){
        System.out.println("School Name: " + schoolName);
    }
    public static void setProgrammingLanguage(){
        System.out.println("Programming language is "+ programmingLanguage);
    }

    private static void printSecretCode(){
        System.out.println("the code is " + secretCode);
    }
    public void attendClass(){
        System.out.println(name+ " is attending the class.");
    }
    public void study(){
        System.out.println(name+ " is studying.");
    }

    public String toString() {// if method has both static and intance, method should be instance
        return "CybertekStudent{" +
                "name='" + name + '\'' +
                ", fieldOfStudy='" + fieldOfStudy + '\'' +
                ", programmingLanguage='" + programmingLanguage + '\'' +
                ", schoolName='" + schoolName + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                ", groupNumber=" + groupNumber +
                '}';
    }
}
/*
	2. create a class named CybertekStudent
            Variables:
                name, gender, age, batchNumber, groupNumber, schoolName, fieldOfStudy, programmingLanguage, secretCode

            Add a constructor to initialize all the fields

            Add a static block to initialize all the statics

            methods:
                printSchoolName();
                printSecretCode();
                attendClass():
                study()
                toString()


 */