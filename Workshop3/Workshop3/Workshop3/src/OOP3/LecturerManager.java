package OOP3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LecturerManager {
    public final List<Lecturer> lecturers;

    public LecturerManager(){
        lecturers = new ArrayList<Lecturer>();
        lecturers.add(new Lecturer(1,"Engin Demiroğ"));
        lecturers.add(new Lecturer(2,"Muhammed İnan "));
        lecturers.add(new Lecturer(3,"Halit Enes Kalaycı"));
    }
    //Listeleme
    public  List<Lecturer> getAll()
    {

        return lecturers;
    }

    //Add ile ekleme

    public void add(Lecturer lecturer)
    {
        lecturers.add(lecturer);
        System.out.println(lecturer.getName() + " - Eğitmeni Başarıyla  eklendi\n" );
    }

    //getById ile ilgili IDli teknolojiyi getir
    public Lecturer getById(int id){
        for(Lecturer lecturer : lecturers){
            if(lecturer.getId()==id){
                return lecturer;
            }

        }
        return null;
    }

    //update işlemi
    public void update(Lecturer lecturer){
        for (Lecturer updateLecturer : lecturers){
            if (updateLecturer.getId()==lecturer.getId())
            {
                updateLecturer.setName(lecturer.getName());
            }
        }
    }

    //delete işlemi
    public void delete(int id) {
        Iterator<Lecturer> iterator = lecturers.iterator();
        while (iterator.hasNext()) {
            Lecturer lecturer = iterator.next();
            if (lecturer.getId() == id)
            {
                iterator.remove();
            }
        }
    }

}
