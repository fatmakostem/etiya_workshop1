import java.util.Scanner;

public class Question3 {
    public static void main(String[] args)
    {
        /*Kullanıcının seçtiği ürünleri, fiyatlarını ve sepete eklenen miktarları bir dizi ile tutan algoritma yazınız.*/

        Scanner scanner = new Scanner(System.in);

        String[] productNames = {"Hamburger", "Pizza", "Sushi", "Lazanya", "Köfte"};
        double[] productPrice = {149.90, 119.99, 349.90, 200, 120};
        double[] productRate = {3.1, 4.2, 4.9, 5.0, 4.0};

        System.out.println("-------------------------------------------");
        System.out.println("Etiya Restoran");
        System.out.println("-------------------------------------------");

        for(int i = 0; i < productNames.length; i++)
        {
            System.out.println(productNames[i] + "  " + productPrice[i] +  " TL  "+ productRate[i] + "/5(*)");

        }

        double totalPrice = 0;
        int totalProductCount = 0;
        for(int i = 0; i < productNames.length; i++)
        {
            System.out.print(productNames[i] +  ": Bu üründen kaç adet istiyorsunuz? ");
            int productCount = scanner.nextInt();
            totalPrice += productCount * productPrice[i];
            totalProductCount += productCount;
        }

        System.out.println("-------------------------------------------");
        System.out.println("SEPET");
        System.out.println("-------------------------------------------\n");

        System.out.println("Sepette " + totalProductCount + " adet ürün bulunmaktadır.");
        System.out.println("Sepetin toplam tutarı " + totalPrice + " TLdir.");

    }
}
