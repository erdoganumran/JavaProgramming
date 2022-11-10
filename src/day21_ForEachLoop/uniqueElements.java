package day21_ForEachLoop;

public class uniqueElements {
    public static void main(String[] args) {
        String[] words = {"java", "java", "c#", "python", "python", "umran"};


        for (String each: words) {// her bir kelime icin bu for loop tekrarlanacak
            int num=0;//each= c#;
            for (String word : words) {// word will change until array finishes
                // her bir kelime icin bu for loop bastan sona tum kelimeler icin tekrarlanacak
                //java.equal.c degil num=0 then java.equal.c num=0 then c.equal.c num=1; ...
                //bu loop bitince devam edecek ve sout yapacak
                //sonra nir sonraki kelime icin basa donecek, each will be python and for pythonm every step at this inner loop will be repeated etc.
                if (word.equals(each)) {
                num++;
                }
            }
                if(num==1){
                    System.out.println(each);}
        }


    }
}
