class OverLoadingMainExample
{
	public static void main(int a)
	{
		System.out.println(a);
	}
	public static void main(float b)
	{
		System.out.println(b);
	}
	public static void main(String arg[])
	{
		OverLoadingMainExample o1=new OverLoadingMainExample();
		main(8);
		main(1.8f);
	}
}