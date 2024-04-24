import java.util.Scanner;
import java.util.Random;
public class Question3 {
    /*Kullanıcının 1 ile 10 arasında rastgele bir sayıyı tahmin etmesini isteyen ve doğru tahmin edene kadar devam eden bir program yazınız.
    (While döngüsü ile yapınız ve rastgele sayı üretmek için Random kütüphanesini kullanınız)*/
    public static void main(String[] args)
    {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int randomNum = random.nextInt(10);

        System.out.print("1 ile 10 arasinda bir sayi tahmin ediniz: ");
        int userNumber = scanner.nextInt();

           while(userNumber != randomNum)
           {
               System.out.print("Maalesef tahmininiz yanlış :(  Bir kez daha deneyiniz: ");
               userNumber = scanner.nextInt();

           }
            System.out.print("Doğru tahmin! Tahmin ettiğiniz sayi: " + randomNum);
        }

    }

