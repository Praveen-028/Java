public class ex_1 {
    public static void main(String[]args)
    {
        double x=1.2345,z;
        int y;/workspaces/Java/Problem Sheet-3/ex_1.java

        z=x;
        y=(int)x;
        x=z-(double)y;

        System.out.println("Before Point"+x);
        System.out.println("After Point"+y);
        
    }
}