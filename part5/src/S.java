class S 
{
	static int x = 10;
	static void test()
	{
		int i = 20;
		x = 40;
		S.x = 60;
			System.out.println(x);
	}
	public static void main(String[] args) 
	{
		System.out.println("main:" + x);
		test();
		System.out.println("main end:" + x);
	}
}
