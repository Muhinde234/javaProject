public class MethodOverload {
    
     static int addInt(int A,int B)
    {
return A+B;
    }
    static double addDouble(double C,double D,double E)
    {
        return C+D+E;
    }
    public static void main(String[] args) {
        
       int myint= addInt(1,2);
       double mydouble= addDouble(3.5,5.6,5.8);
    }
}
