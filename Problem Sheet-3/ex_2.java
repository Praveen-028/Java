public class ex_2 {
    public static void main(String[]args)
    {
        float miles=24;
        float hours=1;
        float minute=40;
        float second=35;
        miles= miles * (float)1.6;
        minute=minute/60;
        second=second/3600;

        float avg= miles/(hours+minute+second);

        System.out.println("Avg :"+avg);
    }
}
