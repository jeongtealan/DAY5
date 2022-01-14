import java.util.Scanner;
public class test12 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int[] array = {10, 20, 30, 40, 50};
		System.out.println("인덱스 2개를 입력받아 값 교체하기");
		System.out.println("인덱스1 입력");
		int idx1 = scanner.nextInt();
		System.out.println("인덱스2 입력");
		int idx2 = scanner.nextInt();
		
		int temp = array[idx1];
		array[idx2] = temp;
		
		System.out.println("[");
		for(int i=0; i<5; i++)
		{
			System.out.println(array[i]+ " ");
		}
		System.out.println("]");
		System.out.println(" ");
		
		System.out.println("");
		System.out.println("값 2개를 입력받아 값 교체하기");
		System.out.println("값1 입력");
		int value1 = scanner.nextInt();
		System.out.println("값2 입력");
		int value2 = scanner.nextInt();
		
		int check1 = 0;
		int check2 = 0;
		
		for(int i=0; i<5; i++)
		{
			if(array[i] == value1)
			{
				check1 = i;
			}
			if(array[i] == value2)
			{
				check2 = i;
			}
		}
		
		temp = array[check1];
		array[check1] = array[check2];
		array[check2] = temp;
		
		System.out.println("[");
		for(int i=0; i<5; i++)
		{
			System.out.println(array[i]+" ");
		}
		System.out.println("]");
		System.out.println();
		
		System.out.println("");
		System.out.println("학번2개를 입력받아 값 교체하기");
		System.out.println("학번1 입력:");
		int data1 = scanner.nextInt();
		System.out.println("학번2 입력:");
		int data2 = scanner.nextInt();
		
		check1 = 0;
		check2 = 0;
		int[] ids = {1001, 1002, 1003, 1004, 1005};
		int[] scores = {87, 11, 45, 98, 23};
		
		for(int i=0; i<5; i++)
		{
			if(ids[i] == data1)
			{
				check1 = i;
			}
			if(ids[i] == data2)
			{
				check2 = i;
			}
		}
		
		temp = scores[check1];
		scores[check1] = scores[check2];
		scores[check2] = temp;
		
		System.out.print("[");
		for(int i=0; i<5; i++)
		{
			System.out.print(scores[i]+" ");
		}
		System.out.print("]");
		System.out.println();
		}
	}

