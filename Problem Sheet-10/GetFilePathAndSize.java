import java.io.File;
public class GetFilePathAndSize {
    public static void main(String[]args)
    {
        final String Name="file1.txt";
        try{
            File obj= new File(Name);
            System.out.println("The path of the java file is :"+obj.getAbsolutePath());
            System.out.println("The length of the java file is :"+obj.length());
        }
        catch(Exception e)
        {
            System.out.println(e.toString());
        }
    }
}
