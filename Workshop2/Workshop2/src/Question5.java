import java.util.ArrayList;

public class Question5 {
    public static void main(String[] args) {

        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Double> grades = new ArrayList<>();


        studentNames.add("Ali");
        grades.add(75.5);
        studentNames.add("Sevval");
        grades.add(85.0);
        studentNames.add("Ceylin");
        grades.add(60.0);
        studentNames.add("Fatma");
        grades.add(90.0);
        studentNames.add("Dilan");
        grades.add(65.0);


        System.out.println("Tüm Öğrenciler:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + ": " + grades.get(i));
        }

        System.out.println("\n!!!Notu 65 altında olan öğrenciler listeden çıkarılacaktır.!!!\n");


        // Belirli bir not aralığı altında kalan öğrencileri listeden silme
        double threshold = 65.0;
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < threshold) {
                studentNames.remove(i);
                grades.remove(i);
                i--; //
            }
        }


        System.out.println("Kalan Öğrenciler:");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println(studentNames.get(i) + ": " + grades.get(i));
        }
    }
}