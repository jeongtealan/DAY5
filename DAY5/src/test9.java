import java.util.Random;
public class test9 {
	public static void main(String[] args) {
		Random random = new Random();
		
		int[] answer = {1, 3, 4, 2, 5};
		int[] hgd = new int[5];
		
		int count = 0;
		
		System.out.print("[");
		for(int i=0; i<5; i++)
		{
			System.out.print(answer[i]+" ");
		}
		System.out.print("]");
		System.out.println(" ");
		
		System.out.print("[");
		for(int i=0; i<5; i++)
		{
			int num = random.nextInt(5)+1;
			hgd[i] = num;
			System.out.print(hgd[i]+" ");
		}
		System.out.print("]");
		System.out.println(" ");
		
		System.out.print("[");
		for(int i=0; i<5; i++)
		{
			if(answer[i] == hgd[i])
			{
				System.out.print("O ");
				count++;
			}
			else
			{
				System.out.print("X");
			}
		}
		System.out.println("]");
		
		System.out.println("¼ºÀû:"+count*20);
	}
}
