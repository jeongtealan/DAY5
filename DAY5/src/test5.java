import java.util.Scanner;
public class test5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("exil�� �Է��ϸ� �����մϴ�.");
		
		while(true) {
			System.out.println(">>");
			String text = scanner.nextLine();
			if(text.equals("exit"))
				break;
		}
		System.out.println("�����մϴ�...");
	}

}
