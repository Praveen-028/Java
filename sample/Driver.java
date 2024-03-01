public class Driver
{
	public static void main(String[]args)
	{
		String[]strArr=new String[5];
		String sep="";
		for(int i=0;i<strArr.length;i++)
		{
			System.out.print(sep+strArr[i]);
			sep=",";
		}
	}
}