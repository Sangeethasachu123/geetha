class O 
{
	static int i = 20;
	public static void main(String[] args) 
	{
		int i = 40;
		System.out.println(O.i);
		System.out.println(i);
		O.i = 200;
		i = 400;
		System.out.println(O.i);
		System.out.println(i);
	}
}
