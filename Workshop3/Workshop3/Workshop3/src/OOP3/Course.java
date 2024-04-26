package OOP3;

public class Course {
    private int id;
    private String name;
    private int categoryId;


    public int getId()
    {

        return this.id;
    }

    public void setId(int id)
    {
        this.id=id;
    }


    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getCategoryId()
    {

        return this.categoryId;
    }

    public void setCategoryId(int categoryId)
    {
        this.categoryId = categoryId;
    }


    public Course (int id,String name, int categoryId)
    {
        this.id = id;
        this.name = name;
        this.categoryId = categoryId;
    }

    public Course()
    {
    }
}
