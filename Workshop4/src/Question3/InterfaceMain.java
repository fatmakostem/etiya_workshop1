package Question3;

public class InterfaceMain {
    public static void main(String[] args) {
        Arac araba = new Araba();
        Arac bisiklet = new Bisiklet();

        araba.hizlan(); // Araba hızlanıyor.
        araba.dur();    // Araba duruyor.

        bisiklet.hizlan(); // Bisiklet hızlanıyor.
        bisiklet.dur();    // Bisiklet duruyor.
    }
}
