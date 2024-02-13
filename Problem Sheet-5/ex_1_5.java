import java.util.*;
public class ex_1_5 {
    public static void main(String[] args) {
        int arr1[]=new int[10],arr2[]=new int[10],c=0;

        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++)
        {
            System.out.print("Enter the number ["+i+"]");
            int num =sc.nextInt();
            arr1[i]=num;

            boolean flag=true;
            for (int j=0;j<i;j++)
            {
                if(arr1[j]==num)
                {
                    flag=false;
                    break;
                }
            }
            if(flag)
            {
                arr2[c]=num;
                c++;
            }
        }
        System.out.println("Displaying the distinct numbers");
        for(int i=0;i<c;i++)
        {
            System.out.println(arr2[i]);
        }
        System.out.println("The count is :"+c);
        sc.close();
    }
}
