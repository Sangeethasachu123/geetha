class Z
{
	public static void main(String[] args) 
	{
		int i = 0;
		if((++i == 1) && (i++ == 2)) // both the operand should be return true if any one is wrong it wont enter the loop
		{
		System.out.println("from if");
		i++;
		}
		System.out.println("end of main");
		System.out.println(i);
	}
}
