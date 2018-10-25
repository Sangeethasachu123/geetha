class T
{
	public static void main(String[] args) 
	{
		if(false)
		{
			System.out.println("from if");
		}
		else if(false)
		{
	    System.out.println("from else if 1");
		}
		else if(false)
		{
		System.out.println("from else if 2");
		}
		else if(true)
		{
		System.out.println("from last else if");
		}
		System.out.println("end of main");
	}
}
// can supply only one else for if condition;
//cannot supply more than one else for if condition;
//can supply more than one else if condition for one if condition;