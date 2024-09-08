public class Info {
    private  int salary;
    private  String accountName;
    public Info( int salary,String accountName)
    {
        this.accountName=accountName;
        this.salary=salary;
    }
    public int getSalary()
    {
        return salary;
    }
    public String getaccountName()
    {
        return accountName;
    }
    public void setaccountName(String accountName )
    {
        this.accountName=accountName;
    }
    public void setsalary(int salary)
    {
        this.salary=salary;
    }
    public void displayInfo()
    {
        System.out.println(salary+" "+accountName);
    }
    public static void main(String[] args) {
       
        Info info=new Info(1200,"Muhizi");
        info.displayInfo();
        info.setsalary(2000);
        info.setaccountName("muhoza");
        info.displayInfo();

        
    }

}
