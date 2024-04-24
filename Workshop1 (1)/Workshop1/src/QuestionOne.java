import java.util.Scanner;
public class QuestionOne {
    /*kullanıcıdan kaç ürün almak istediğini soran,her ürünün fiyatını alarak toplam alışveriş tutarını hesaplayan bir
    algoritma yazınız.(Input için Scanner ve döngü için for döngüsü kullanınız) */
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet ürün satın almak istiyorsunuz, lütfen giriniz: ");
        int countOfProducts = scanner.nextInt();
        double totalAmount = 0;
        for(int i = 1; i <= countOfProducts; i++)
        {
            System.out.print("Lütfen " + i + ". ürünün fiyatını giriniz:");
            double  productPrice = scanner.nextDouble();
            totalAmount += productPrice;

        }
        System.out.println("Ürünlerin topla fiyatı: " + totalAmount );
    }

}
