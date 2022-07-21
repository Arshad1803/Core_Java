//Program for converting Fahrenheit to Celsius

class Celsius
{
	public static void main(String args[])
	{
		float fahrenheit = 321.0f;
		float celsius = (fahrenheit - 32)*5/9;
		System.out.println("The Fahrenheit Value is : " +fahrenheit);
		System.out.println("The Celsius Value is : " +celsius);
	}
}