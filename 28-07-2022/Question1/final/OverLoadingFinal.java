class OverLoadingFinal
{
	final void Addition(int a,int b)
		 {
			 System.out.println("sum of integer:"+(a+b));
		 }
	final void Addition(float a,float b)
		{
			System.out.println("SUm of Float:"+(a+b));
		}
	public static void main(String Arg[])
	{
		OverLoadingFinal o1=new OverLoadingFinal();
		o1.Addition(5,7);
		o1.Addition(1.3f,4.7f);
	}
}