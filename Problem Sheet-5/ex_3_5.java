import java.util.*;
public class ex_3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int[] arr1 = new  int [10];
        for (int i=0;i<10;i++)
        {
            System.out.print("enter the number ["+i+"]");
            arr1[i]=sc.nextInt(); 
        }
        int n=arr1.length;
        for (int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr1[j]>arr1[j+1])
                {
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        System.out.print("The sorted array is :");
        for (int i=0;i<10;i++)
        {
            System.out.print(" "+arr1[i]);
        }
    sc.close();
    }
}