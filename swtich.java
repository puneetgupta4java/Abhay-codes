import java.util.Scanner;

public class swtich {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the string:");
		String s = sc.next();
		switch (s) {
		case "Monday":
			System.out.println("I am Monday");
			break;
		case "Tuesday":
			System.out.println("I am Tuesday");
			break;
		default:
			System.out.println("No day");
			break;
		}

	}
}
