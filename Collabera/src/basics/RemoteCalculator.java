package basics;

public class RemoteCalculator implements Calculator{

	
	public int add(int...arr) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int a:arr)
		{
			sum=sum+a;
		}
		return sum;
	}
/*public int sub(int a,int b)
	{
		return a-b;
	}*/


	}


