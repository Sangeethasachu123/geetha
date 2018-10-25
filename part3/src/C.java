class D
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((i++ == 0) || (i++ == 1))//if first condition is false the it goes to second condition
		{
		System.out.println("from if");
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}
//in this case first condition is true so it wont check the second condition 