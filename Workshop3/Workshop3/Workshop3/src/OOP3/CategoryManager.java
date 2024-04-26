package OOP3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryManager {
    public final List<Category> categories;

    public CategoryManager(){
        categories = new ArrayList<Category>();
        categories.add(new Category(1,"Programlama "));
    }
    //Listeleme
    public  List<Category> getAll()
    {

        return categories;
    }

    //Add ile ekleme
    public void add(Category category)
    {
        categories.add(category);
        System.out.println(category.getName() + " - Kategorisi Başarıyla  eklendi\n" );
    }

    //getById ile ilgili IDli teknolojiyi getir
    public Category getById(int id){
        for(Category category : categories){
            if(category.getId()==id){
                return category;
            }

        }
        return null;
    }

    //update işlemi
    public void update(Category category){
        for (Category updateCategory : categories){
            if (updateCategory.getId()==category.getId())
            {
                updateCategory.setName(category.getName());
            }
        }
    }

    //delete işlemi
    public void delete(int id) {
        Iterator<Category> iterator = categories.iterator();
        while (iterator.hasNext()) {
            Category category = iterator.next();
            if (category.getId() == id)
            {
                iterator.remove();
            }
        }
    }

}
