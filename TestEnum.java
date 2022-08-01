public class TestEnum
{
	enum Season
	{
		WINTER(5),
		SUMMER(3),
		SPRING(10);

		private int value;
 		private Season(int value)
		{
			this.value = value;
		}
	}
	public static void main(String args[])
	{
		for(Season s: Season.values())
		{
			System.out.println(s+" "+s.value);
		}
	}
}
