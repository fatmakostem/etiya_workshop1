package OOP3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {
    public final List<Course> courses;

    public CourseManager(){
        courses = new ArrayList<Course>();
        courses.add(new Course(1,"Yazılım Geliştirici Yetiştirme Kampı ",1));
        courses.add(new Course(2,"Yazılım Geliştirici Yetiştirme Kampı (JavaScript) ",1));
        courses.add(new Course(3,"Senior Yazılım Geliştirici Yetiştirme Kampı ",1));
    }
    //Listeleme
    public  List<Course> getAll()
    {

        return courses;
    }

    //Add ile ekleme

    public void add(Course course)
    {
        courses.add(course);
        System.out.println(course.getName() + " - Kursu Başarıyla  eklendi\n" );
    }

    //getById ile ilgili IDli teknolojiyi getir
    public Course getById(int id){
        for(Course course : courses){
            if(course.getId()==id){
                return course;
            }
        }
        return null;
    }

    //update işlemi
    public void update(Course course){
        for (Course updateCourse : courses){
            if (updateCourse.getId()==course.getId())
            {
                updateCourse.setName(course.getName());
                updateCourse.setCategoryId(course.getCategoryId());
            }
        }
    }

    //delete işlemi
    public void delete(int id) {
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getId() == id) {
                iterator.remove();
            }
        }
    }

}
