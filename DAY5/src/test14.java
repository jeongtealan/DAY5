import java.util.Random;
public class test14 {
	public static void main(String[] args) {
		int[] array = new int[5];
		int[] check = new int[5];
		
		Random random = new Random();
				
		for(int i=0; i<5; i++)
		{
			int num = random.nextInt(5);
			array[i] = num;
			if(check[num] == 0)
			{
				check[num] = 1;
			}
			else
			{
				i--;
			}
		}
	for(int i=0; i<5; i++)
	{
		System.out.println(array[i]);
	}
	}

}
