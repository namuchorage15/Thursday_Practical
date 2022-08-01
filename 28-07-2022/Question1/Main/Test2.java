class OverLoadingMain
{
	public static void main(int a)
	{
		System.out.println(a);
	}
}
class OverMain extends OverLoadingMain
{
	public static void main(int a)
	{
		System.out.println("INSIDE THE OVERMAIN CLASS"+a);
	}
}
class Test2
{
	public static void main(String Arg[])
	{
		OverMain o1.main()=new OverMain(6);
		main(6);
	}
}
		
