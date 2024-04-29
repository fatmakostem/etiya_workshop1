package Question2;

public class PolimorfizmMain {
    public static void main(String[] args) {
        Hayvan hayvan1 = new Kedi();
        Hayvan hayvan2 = new Kopek();

        hayvan1.sesCikar(); // Kedi sınıfındaki override edilmiş metod çağrılacak
        hayvan2.sesCikar(); // Köpek sınıfındaki override edilmiş metod çağrılacak
    }
}
