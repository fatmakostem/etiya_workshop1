package Question3;

public class Bisiklet implements Arac {
    @Override
    public void hizlan() {
        System.out.println("Bisiklet hızlanıyor.");
    }

    @Override
    public void dur() {
        System.out.println("Bisiklet duruyor.");
    }
}
