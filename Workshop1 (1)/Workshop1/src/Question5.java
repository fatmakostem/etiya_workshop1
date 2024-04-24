import java.util.Random;
import java.util.Scanner;

public class Question5 {
    /*String metotlarını araştırınız. Her bir metot için örnek yapınız.*/
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String str = "kitap";
        System.out.println("String: " + str);

        int length = str.length();
        System.out.println("Stringin uzunluğu: " + length);

        char ch = str.charAt(0);
        System.out.println("stringin 0. index değeri " + ch);

        String subStr = str.substring(3);
        System.out.println("stringin 3. indexi ve sonrasındaki değerler " + subStr);

        String subStr2 = str.substring(2, 4);
        System.out.println("stringin 2. indexinden 4.indexine kadar olan değerler " + subStr2);

        String upperCaseStr = str.toUpperCase();
        System.out.println("stringin tüm index değerleri büyük yazilir " + upperCaseStr);

        upperCaseStr = str.toLowerCase();
        System.out.println("stringin tüm index değerleri küçük yazilir " + upperCaseStr);

        int index = str.indexOf("ita");
        System.out.println("stringin başlangıç index değeri: " + index);

        boolean contains = str.contains("Def");
        System.out.println("String girdiyi içeriyor mu " + contains);



    }
}
