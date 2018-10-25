class J
{
	public static void main(String[] args) 
	{
		for(int i = 0; i < 10; i++)
		{
		System.out.println("loop begin");
		if (i > 5)
		{
			break;// use condition; also// break should be the last condition in the body or else it throws an error;
		    System.out.println("from if");
		}
            System.out.println("loop end");
		}
		    System.out.println("main end");
	}
}
