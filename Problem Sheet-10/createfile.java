import java.io.File;
public class createfile {
    public static void main(String[]args)
    {
        final String fileName = "file1.txt";

    try {
      File objFile = new File(fileName);
      if (objFile.createNewFile()) {
        System.out.println("File created successfully.");
      } else {
        System.out.println("File creation failed!!!");
      }
    } 
    catch (Exception Ex) {
      System.out.println("Exception : " + Ex.toString());
        }
    }
}
