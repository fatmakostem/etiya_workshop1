import java.util.Scanner;

public class Question2 {
    /*Do-While ve While döngüsü nedir? Bununla ilgili örnek yapınız.*/
    public static void main(String[] args)
    {
        /*Belirli bir koşul doğru olduğu sürece döngünün devam ettiği döngü tipidir. While ve for döngüsünden farklı olarak do-while döngüsünde, döngü bir kere kesin olarak çalıştırırlır.
        Ardından koşul kontrolü sağlanır ve true ise döngü koşul sağlandığı sürece çalışmaya devam eder, false ise döngüden çıkılır ve bir kere çalışmış olur.*/


        /*While döngüsü ise for döngüsü ile benzer çalışır. Döngü içine girilmeden koşul kontrolü sağlanır ve koşul true olduğu sürece döngüye girer ve döngü çalışırç. */

        /*Kullanıcıdan pozitif bir sayı girişi isteyen ve girilen sayının faktöriyelini hesaplayan bir program yazın.*/

        Scanner scanner = new Scanner(System.in);

        System.out.print("Faktöriyeli hesaplanacak pozitif bir tamsayi giriniz: ");
        int num = scanner.nextInt();

        if(num <= 0) {
            System.out.print("Hatalı girdi!! Yalnızca pozitif tamsayı girişi yapabilirsiniz. ");
            return;
        }

        else {
            int factorial = 1;
            do
            {
               factorial *= num;
               num--;
            } while(num > 0 );
            System.out.print("Girmiş olduğunuz sayinin faktöriyeli: " + factorial);
        }
    }
}
