
public class FirstNPrimeNumbers_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean var = true;
		for (int i=2; i<=50; i++)
		{
			for (int j=2; j<i; j++)
			{
				if (i%j==0)
				{
					var=false;
					break;
				}
			}
			if(var==true)
        	{
           	 	System.out.print(i+" ") ;
        	}
			var=true;
		}
		

	}

}
