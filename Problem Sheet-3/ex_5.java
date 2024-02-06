public class ex_5 {
    public static void main(String[] args) {
        boolean a,b,Q;
        a=true;
        b=true;
        Q= (!(a&&b)&&(a||b))||((a&&b)||!(a||b));

        System.out.println("The final Output is :"+Q);
    }
    
}
