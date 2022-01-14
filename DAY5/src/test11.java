
public class test11 {
public static void main(String[] args) {
	int[] array = {44, 11, 29, 24, 76};
	int[] temp = null;
	
	int count = 0;
	for(int i=0; i<5; i++)
	{
		if(array[i]%4 == 0)
		{
			count++;
		}
	}
	
	temp = new int[count];
	int check = 0;
	
	for(int i = 0; i<5; i++)
	{
		if(array[i]%4 == 0)
		{
			temp[check] = array[i];
			check++;
		}
	}
	System.out.println("[");
	for(int i = 0; i<count; i++)
	{
		System.out.println(temp[i]+" ");
	}
	System.out.println("]");
}
}
