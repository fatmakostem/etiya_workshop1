public class Question2 {

    public static void main(String[] args)
    {
        /*Restoranın menüsündeki yemekleri, fiyatlarını ve popülerlik derecelendirmelerini bir dizi ile tutan algoritma yazınız.*/


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
    }
}
