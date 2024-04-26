package OOP3;

import java.util.List;

public class LecturerMain {

    public static void main(String[] args)
    {
        LecturerManager lecturerManager = new LecturerManager();
        List<Lecturer> lecturers = lecturerManager.getAll();
        Lecturer lecturer = new Lecturer();


        System.out.println("-----------------------------------");
        System.out.println("EĞİTMEN İSİMLERİNİ LİSTELEME\n");
        for (Lecturer lecturer1 : lecturers){
            System.out.println(lecturer1.getName() + " id:  " + lecturer1.getId());
        }

        System.out.println("-----------------------------------");
        System.out.println("YENİ BİR EĞİTMEN EKLEME\n");

        lecturerManager.add(new Lecturer(4,"İrem Balcı"));

        for (Lecturer lecturer1 : lecturers){
            System.out.println(lecturer1.getName() + " id:  " + lecturer1.getId());
        }

        System.out.println("-----------------------------------");
        System.out.println("ID'YE GÖRE EĞİTMEN GETİRME\n");

        Lecturer responseLecturer = lecturerManager.getById(2);
        System.out.println("id: " + responseLecturer.getId() + " " + responseLecturer.getName());

        System.out.println("-----------------------------------");
        System.out.println("UPDATE İŞLEMİ\n");

        lecturer.setId(4);
        lecturer.setName("İrem BALCI - Figma  ");
        lecturerManager.update(lecturer);

        for (Lecturer lecturer1 : lecturers)
        {
            System.out.println(lecturer1.getName() + " id: " +lecturer1.getId() );

        }


          System.out.println("---------------------------------");
          System.out.println("DELETE İŞLEMİ\n");

            lecturerManager.delete(4);
            for (Lecturer lecturer1 : lecturers)
            {
                System.out.println(lecturer1.getName() + " id: " +lecturer1.getId());
            }


    }

}
