public class Constructor {
   int x;
    public Constructor()
    {
        x=6;
    }
    public static void main(String[] args) {
        Constructor con= new Constructor();
        System.err.println(con.x);
    }

}
