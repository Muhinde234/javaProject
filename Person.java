public class Person {
    private String name;
    private int age;
    public Person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public String getName()
    {
        return name;
    }
    public int  getAge()
    {
        return age;
    }
   public void setName(String name)
{
    this.name=name;

}
public void setAge(int age)
{
    this.age=age;

}
public  void display()
{
    System.out.println( name +" "+ age );
}
public static void main(String[] args) {
   Person person=new Person("dosta", 12);
   person. display();
}

}
