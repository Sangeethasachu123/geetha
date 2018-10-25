class C1
{
	public static void test (int i) 
	{
		System.out.println("from test:" + i);
	}
	public static void main(String[] args)
	{
		System.out.println("main begin");
		test(100);
	}
}
// it shows error if we dont give the test() value test(100);