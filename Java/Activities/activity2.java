package activities;

public class activity2 {
	public static void main(String[] args)
	{
		int[] array={10, 77, 10, 54, -11, 10};
		int count=0;
		for(int i=0;i<array.length;i++)
			if(array[i]==10)
			{
				count=count+array[i];
			}
		System.out.println("Count of 10's is "+count);
		if(count==30)
		{
			System.out.println("Count is 30 ");
		}
		else
		{
			System.out.println("Count is NOT 30 ");
		}
		
	}

}
