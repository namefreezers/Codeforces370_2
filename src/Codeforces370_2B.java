import java.util.Scanner;

public class Codeforces370_2B {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		in.close();
		if (s.length()%2 == 1){
			System.out.println(-1);
			return;
		}
		int x = 0, y = 0;
		for (int i = 0; i < s.length(); i++){
			switch(s.charAt(i)){
			case 'U':
				y++;
				break;
			case 'D':
				y--;
				break;
			case 'L':
				x--;
				break;
			case 'R':
				x++;
				break;
			}
		}
		//if ((Math.abs(x)+Math.abs(y))%2 == 1)
			//System.out.println("error");
		System.out.println((Math.abs(x)+Math.abs(y))/2);

	}

}
