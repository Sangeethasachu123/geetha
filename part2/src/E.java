class E 
{
	public static void main(String[] args) 
	{
		int i = 0;
		int j = ++i + --i + ++i + i + --i + i + i++ + --i + i++ + --i + i++ + i + i;
		    j = 1 +    0 +   1 +  1 +   0 + 0 + 0 +     0 + 0 +     0 + 0 +    1 + 1
		System.out.println(i);
		System.out.println(j);
	}
}
