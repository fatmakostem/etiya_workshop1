import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Question6 {
    public static void main(String[] args) {
        /*Günlük görevlerimizi içeren ve bu görevlerin tamamlanma bilgisini tutan bir Arraylist oluşturunuz.ArrayList içinde bulunan görevleri güncelleyen,
          tamamlanan görevleri ise silen algoritmayı yazınız.*/
        Scanner scanner = new Scanner(System.in);

        //Görev listesini tutan iç içe arraylist tanımlama
        ArrayList<ArrayList<Object>> taskList = new ArrayList<>();

        //her taskı ve durumunu içteki arraylistte tutuyoruz.Bu her task ise dışarıdaki arraylistn bir elemanı oluyor. [[Kitap okuma, false], [Flow oluşturma,false],...]
        taskList.add(new ArrayList<>());
        taskList.get(0).add("Kitap okuma");
        taskList.get(0).add(false);

        taskList.add(new ArrayList<>());
        taskList.get(1).add("Analiz dökümanı düzenleme");
        taskList.get(1).add(false);

        taskList.add(new ArrayList<>());
        taskList.get(2).add("Mockup hazırlama");
        taskList.get(2).add(false);

        taskList.add(new ArrayList<>());
        taskList.get(3).add("Flow oluşturma");
        taskList.get(3).add(false);

        taskList.add(new ArrayList<>());
        taskList.get(4).add("Use Case Diyagramı oluşturma");
        taskList.get(4).add(false);

        taskList.add(new ArrayList<>());
        taskList.get(5).add("Activity Diyagramı oluşturma");
        taskList.get(5).add(false);

        System.out.println("--------------------------------");
        System.out.println("Günlük Görevler");
        System.out.println("--------------------------------");

        /*Görevleri for each ile ekrana yazdırıyoruz. tasks arraylistinin tipi Object olduğu için taskName değişkenine tasks'ın
        bir elemanını atarken casting yapıyoruz. Çünkü taskName değişkenin tipi string. stringe object atanamaz casting yapıp tür dönüştürmek gerekir.*/
        for(ArrayList<Object> tasks : taskList)
        {
            String taskName = (String) tasks.get(0); //casting
            boolean taskState = (boolean) tasks.get(1); //castng
            System.out.println("Görev adı ve tamamlanma durumu: " + taskName + " / " + taskState);
        }

        //Yapılan görevleri(trueya dönenleri) ayrı bir arraylistte tutuyoruz
        ArrayList<ArrayList<Object>> done = new ArrayList<>();
        for(ArrayList<Object> tasks : taskList)
        {
            String taskName = (String) tasks.get(0);
            boolean taskState = (boolean) tasks.get(1);

            System.out.print( taskName + " yapıldı mı? ");
            boolean isDone = scanner.nextBoolean();


            if(isDone){
                done.add(tasks);
            }
        }


        //Yapılan görevlerin tutulduğu done arraylsitini for each ile ekrana bastırma. Tamamlanan görev yoksa ve done araylisti boşsa ekrana uyarı mesajı verir.

        if(done.isEmpty()) {
            System.out.println("\nHenüz hiç görev tamamlanmadı :(\n");
        } else {

            System.out.println("--------------------------------");
            System.out.println("Tamamlanan Görevler");
            System.out.println("--------------------------------");

            for(ArrayList<Object> tasks : done)
            {
                String taskName = (String) tasks.get(0); //casting
                boolean taskState = (boolean) tasks.get(1); //castng
                taskState = true;
                System.out.println("Tamamlanan görev: " + taskName );
            }
        }

        //removeAll metodu ile done arraylistinde bulunan görevler ana listemiz olan taskList listesinden siliniyor.
        taskList.removeAll(done);


        //Yapılan görevler listeden çıkarıldıktan sonra yapılacak kalan görevleri for each ile ekrana bastırma.Tüm görevler yapılmışsa ve taskList boşsa ekrana uyarı verir.
        if(taskList.isEmpty()){
            System.out.println("\nTebrikler!!! tüm görevleri tamamladınız :) \n");
        }
        else
        {
            System.out.println("--------------------------------");
            System.out.println("Tamamlanacak Günlük Görevler");
            System.out.println("--------------------------------");


            for(ArrayList<Object> tasks : taskList)
            {
                String taskName = (String) tasks.get(0); //casting
                boolean taskState = (boolean) tasks.get(1); //castng
                System.out.println("Tamamlanacak görev: " + taskName);
            }

        }

    }
}
