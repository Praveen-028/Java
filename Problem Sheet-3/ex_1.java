public class ex_1 {
    public static void main(String[]args)
    {
        double x=1.2345,z;
        int y;

        z=x;
        y=(int)x;
        x=z-(double)y;

        System.out.println(x);
        System.out.println(y);
    }
}