import java.util.*;
public class ex_4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the water weight");
        float M =sc.nextFloat();
        System.out.println("Enter Inital Temperature");
        float IT=sc.nextFloat();
        System.out.println("Enter Final Temperature");
        float FT=sc.nextFloat();

        float Q = M*(FT-IT)*4184;

        System.out.println("The energy used is "+ Q);

        sc.close();
    }
}
