public class Recursion1 {
    public static void main(String[]args)
    {
        int num =13;
        System.out.println(mystery(num));
    }
    public static int mystery(int myNum)
    {
        if(myNum<=0)
        {
            return 0;
        }
        else if(myNum % 2 == 0)
        {
            return 2+ mystery(myNum -1 );
        }
        else
        {
            return 1+ mystery(myNum - 2);
        }
    }
}
