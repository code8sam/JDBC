package edu.jspiders.objectcreationdemo;

public class MainApp 
{
	public static void main(String[] args)
	{
		/*Test t = new Test();
		t.m1();*/
		
		try 
		{
			/*Class c = Class.forName("edu.jspiders.objectcreationdemo.Test");
			Object obj = c.newInstance();
			Test t = (Test) obj;
			t.m1();*/
			
			Test t = (Test) Class.forName("edu.jspiders.objectcreationdemo.Test").newInstance();
			t.m1();
			
		}
		catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) 
		{
			e.printStackTrace();
		}
	}
}
