import java.io.*;
import java.util.*;
public class first{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        try{
            System.out.println("Enter the text file name");
            String filename= "sample.txt";
            sc.nextLine();
            File obj=new File(filename);
            if (obj.createNewFile())
            {
                System.out.println("The file is created");
            }
            else{
                System.out.println("the file is not created");
            }
            FileOutputStream fout=new FileOutputStream(filename);
            while(true)
            {
                System.out.println("Enter the string :");
                String context=sc.nextLine();
                context=context.toLowerCase();
                if (context.equals("stop"))
                {
                    break;
                }
                else{
                    byte input[]=(context+"\n").getBytes();
                    fout.write(input);
                }

            }
            System.out.println("The string in the file is");
            Scanner myread= new Scanner(obj);
            String shortstr="",longstr="";
            int s1=Integer.MAX_VALUE,l1=Integer.MIN_VALUE;
            int c=0,sum=0;
            while (myread.hasNextLine())
            {
                String content=myread.nextLine();
                int strlen=content.length();
                c++;
                if(strlen<s1)
                {
                    shortstr=content;
                    s1=strlen;
                }
                if(strlen>l1)
                {
                    longstr=content;
                    l1=strlen;
                }
                sum=strlen+sum;
            }
            System.out.println("The longest word is : "+ longstr);
            System.out.println("The shortest word is :"+ shortstr);
            System.out.println("The average lenght of the word is "+(sum/c));
            fout.close();
        }
        catch (Exception e)
        {
            System.out.println("The Error is :"+ e.toString());
        }
    }
}