class T
{
	public static void main(String[] args) 
	{
		System.out.println("from main");
		 int i = test();
		 int j = i + test();
		System.out.println("j =" + i);
		System.out.println("j =" + i);
		}
		public static int test()
	   {
		System.out.println("from test");
		return 100;
	   }
}
