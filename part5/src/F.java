class F 
{
	static int i;
	static double j;
	static boolean k;
	static char m;
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(j);
		System.out.println(k);
		System.out.println(m);
		System.out.println('\u0000');
	}
}
// default value of char is "uooo" but it will not show in console.
