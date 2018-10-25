class K
{
	public static void main(String[] args) 
	{
		if(true)
		{// this condition ending here itself
		System.out.println("from if");
		if(true)
		{
            System.out.println("from inner if");
		}
	}
			else //rw ,keyword
		{
		System.out.println("from else"); 
		}// 
		System.out.println("end main"); // 
	}
}
