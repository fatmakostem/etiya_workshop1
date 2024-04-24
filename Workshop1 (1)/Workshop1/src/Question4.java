import java.util.Random;
import java.util.Scanner;

public class Question4 {
    /*Bir sayının mükemmel sayı olup olmadığı kontrol eden algoritma yazınız.*/
    public static void main(String[] args)
    {
    /*kendisi hariç tüm pozitif bölenleri toplamı kendisine eşit olan sayı mükemmel sayıdır. Örn (6, 28, 496, 8128, 33550336, 8589869056)*/
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir pozitif tam sayi giriniz: ");
        long perfectNum = scanner.nextLong();
        long total = 0;
        for(long i = 1; i < perfectNum; i++ )
        {
            if(perfectNum % i == 0)
            {
                total += i;
            }
        }
        if(total == perfectNum)
            System.out.print(perfectNum + " mükemmel bir sayidir");
        else
            System.out.print(perfectNum + " mükemmel bir sayi değildir");
    }
}
