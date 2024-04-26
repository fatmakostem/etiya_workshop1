package OOP3;

import java.util.List;

public class CategoryMain {

    public static void main(String[] args)
    {
        CategoryManager categoryManager = new CategoryManager();
        List<Category> categories = categoryManager.getAll();
        Category category = new Category();


        System.out.println("-----------------------------------");
        System.out.println("KATEGORİ İSİMLERİNİ LİSTELEME\n");
        for (Category category1 : categories){
            System.out.println(category1.getName() + " id:  " + category1.getId());
        }

        System.out.println("-----------------------------------");
        System.out.println("YENİ BİR KATEGORİ EKLEME\n");

        categoryManager.add(new Category(2,"Analiz"));

        for (Category category1 : categories){
            System.out.println(category1.getName() + " id:  " + category1.getId());
        }

        System.out.println("-----------------------------------");
        System.out.println("ID'YE GÖRE KATEGORİ GETİRME\n");

        Category responseCategory = categoryManager.getById(2);
        System.out.println("id: " + responseCategory.getId() + " " + responseCategory.getName());

        System.out.println("-----------------------------------");
        System.out.println("UPDATE İŞLEMİ\n");

        category.setId(2);
        category.setName("Test  ");
        categoryManager.update(category);

        for (Category category1 : categories)
        {
            System.out.println(category1.getName() + " id: " +category1.getId() );

        }


         System.out.println("---------------------------------");
        System.out.println("DELETE İŞLEMİ\n");

        categoryManager.delete(2);
        for (Category category1 : categories)
        {
            System.out.println(category1.getName() + " id: " +category1.getId());
        }


    }

}
