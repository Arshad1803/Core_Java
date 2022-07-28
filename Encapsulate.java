public class Encapsulate
{
	private String studName;
	private int studRoll;
	
	public String getStudName()
	{
		return studName;
	}
	public void setStudName(String studName)
	{
		this.studName = studName;
	}
	public int getStudRoll()
	{
		return studRoll;
	}
	public void setStudRoll(int studRoll)
	{
		this.studRoll = studRoll;
	}

	public static void main(String args[])
	{
		Encapsulate obj = new Encapsulate();
		obj.setStudName("Arham");
		obj.setStudRoll(1);
		System.out.println("Student Name is: " +obj.studName);
		System.out.println("Student Roll Number is: " +obj.studRoll);
	}
}