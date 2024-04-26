package OOP3;

import OOP3.Course;
import OOP3.CourseManager;

import java.util.Iterator;
import java.util.List;

public class CourseMain {

    public static void main(String[] args)
    {
        CourseManager courseManager = new CourseManager();
        List<Course> courses = courseManager.getAll();
        Course course = new Course();

        System.out.println("-----------------------------------");
        System.out.println("COURSE İSİMLERİNİ LİSTELEME\n");
        for (Course courses1 : courses){
            System.out.println(courses1.getName() + " id:  " + courses1.getId() +
                    " kategori id: " + courses1.getCategoryId());
        }

        System.out.println("-----------------------------------");
        System.out.println("YENİ BİR KURS EKLEME\n");

        courseManager.add(new Course(4,"2024 - Yazılım Geliştirici Yetiştirme Kampı C#",1));

        for (Course courses1 : courses){
            System.out.println(courses1.getName() + " id:  " + courses1.getId() +
                    " kategori id: " + courses1.getCategoryId());
        }

        System.out.println("-----------------------------------");
        System.out.println("ID'YE GÖRE KURS GETİRME\n");

       Course responseCourse = courseManager.getById(2);
       System.out.println("id: " + responseCourse.getId() + " " + responseCourse.getName() +
                " kategori id: " + responseCourse.getCategoryId());

        System.out.println("-----------------------------------");
        System.out.println("UPDATE İŞLEMİ\n");

        course.setId(4);
        course.setName("(2023) Yazılım Geliştirici Yetiştirme Kampı (Python & Selenium)  ");
        course.setCategoryId(2);
        courseManager.update(course);

          for (Course course1 : courses)
          {
              System.out.println(course1.getName() + "id: " +course1.getId() + " kategori id: "
                      +course1.getCategoryId());

          }


          System.out.println("---------------------------------");
          System.out.println("DELETE İŞLEMİ\n");

            courseManager.delete(1);
            for (Course course1 : courses)
            {
                System.out.println(course1.getName() + "id: " +course1.getId() + " kategori id: "
                        +course1.getCategoryId());
            }


    }

}
