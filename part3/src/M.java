class M
{
	public static void main(String[] args) 
	{
		if(false)
			if(true) //part of first if condition that is false so it wont exwcute
	              System.out.println("from inner if");
		else 
		System.out.println("else 1"); 
		else
		System.out.println("else 2"); // execute and print;
	}
}
