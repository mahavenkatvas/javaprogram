class a
{
	int x=20;
}
class b extends a
{
	
	public static void main(String args[])
	{   int y=30;
		b s=new b();
		int ans=s.x+y;
		System.out.println(ans);
	}
}
