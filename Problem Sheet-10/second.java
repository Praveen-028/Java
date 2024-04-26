import java.io.*;
import java.util.*;

public class second {
    public static void main(String[]args)
    {
        try{
            String filename="Z:\Sem-2\Java\Java\Problem Sheet-10\Second.dat";
            File obj=new File(filename);
            if (obj.createNewFile())
            {
                System.out.println("The file is created");
            }
            else{
                System.out.println("the file is not created");
            }
            FileOutputStream fout=new FileOutputStream(filename);
            Scanner sc= new Scanner(System.in);
            int num=sc.nextInt();

            for(int i=0;i<num;i++)
            {
                Random ran=new Random();
                int ranum=ran.nextInt();
                byte input[]=(ranum+"\n").getBytes();
                fout.write(input);
            }

            
        }
        catch(Exception e){

        }
    }
}
