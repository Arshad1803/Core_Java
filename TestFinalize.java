// Program to show finalize() method

public class TestFinalize
{
	protected void finalize()
	{
		System.out.println("Performing cleanup before destroying the objects");
	}

	public static void main(String args[])
	{
		TestFinalize tobj = new TestFinalize();
		tobj = null;
		System.gc();
		System.out.println("Object is destroyed successfully");
	}
}