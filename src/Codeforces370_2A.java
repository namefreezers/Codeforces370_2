import java.util.Scanner;

public class Codeforces370_2A {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = Integer.parseInt(in.nextLine());
		String[] s = in.nextLine().split(" ");
		in.close();
		int prev = Integer.parseInt(s[0]);
		int next = 0;
		for (int i = 1; i<n; i++){
			next = Integer.parseInt(s[i]);
			System.out.print((next+prev) + " ");
			prev = next;
		}
		System.out.println(Integer.parseInt(s[n-1]));
	}

}
