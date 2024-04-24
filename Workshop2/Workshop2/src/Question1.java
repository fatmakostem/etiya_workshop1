import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ürün sayısını al
        System.out.print("Kaç çeşit ürün satıldı?: ");
        int urunSayisi = scanner.nextInt();

        // Ürün bilgilerini ve fiyatlarını tutacak diziler oluştur
        String[] urunAdlari = new String[urunSayisi];
        double[] urunFiyatlari = new double[urunSayisi];
        int[] satisMiktari = new int[urunSayisi];

        int totalProductCount = 0;

        // Ürün bilgilerini ve fiyatlarını al
        for (int i = 0; i < urunSayisi; i++) {
            System.out.println("\nÜrün " + (i + 1) + " bilgileri:");

            System.out.print("Ürün adı: ");
            urunAdlari[i] = scanner.next();

            System.out.print("Ürün fiyatı: ");
            urunFiyatlari[i] = scanner.nextDouble();

            System.out.print("Satış miktarı: ");
            int productCount = satisMiktari[i] = scanner.nextInt();

            totalProductCount += productCount;
        }

        // Toplam satış gelirini hesapla
        double toplamSatisGeliri = 0;
        for (int i = 0; i < urunSayisi; i++) {
            toplamSatisGeliri += urunFiyatlari[i] * satisMiktari[i];
        }

        // Sonucu yazdır

        System.out.println("\nGünlük Toplam Satış Miktarı: " + totalProductCount + " adet");
        System.out.println("\nGünlük Toplam Satış Geliri: " + toplamSatisGeliri + " TL");

        scanner.close();
    }
}
