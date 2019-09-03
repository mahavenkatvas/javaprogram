class a
{
	int s;
	int b;
	public a(int x,int y){
		s=x;
		b=y;
	}
	 void add()
	 {
	 	System.out.println(s+b);
	 }
	

}
class b
{
public static void main(String args[])
{
	a ob=new a(2,3);
	ob.add();
	
}
}
