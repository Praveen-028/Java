public class Recursion {
    public static void main(String[]args)
    {
        int num=2;
        System.out.println(mystery(num));
    }
    public static int mystery(int myNum)
    {
        if(myNum <2)
        {
            return 3;
        }
        else
        {
            return 2+ mystery(myNum-2);
        }
    }
}