import java.util.Scanner;

public class Codeforces370_2C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s[] = in.nextLine().split(" ");
		in.close();
		int first = Integer.parseInt(s[0]);
		int last = Integer.parseInt(s[1]);
		int sm = last, med = last, lar = last;
		int temp;
		int count = 0;
		while (lar < first) {
			count++;
			temp = med+lar-1;
			sm= med;
			med = lar;
			lar = temp;
		}
		if (lar < first) {
			count++;
			lar = first;
		}
		if (med < first) {
			count++;
			med = first;
		}
		if (sm < first) {
			count++;
			sm = first;
		}
		System.out.println(count);

	}

}
