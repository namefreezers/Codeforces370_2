import java.util.Scanner;

public class Codeforces370_2C {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String s[] = in.nextLine().split(" ");
		in.close();
		int f = Integer.parseInt(s[0]);
		int l = Integer.parseInt(s[1]);
		int sm = f, med = f, lar = f;
		int temp;
		int count = 0;
		while(sm + l + 1< med && sm<= l+l+1){
			count++;
			temp = Math.max((int) Math.round((double)sm/3), med+1-sm);
			lar = med;
			if(sm>temp)
			{med = sm;
			sm = temp;}
			else{
				med = temp;
			}
		}
		if(lar != l){
			count++;
			lar = l;
		}
		if(med != l){
			count++;
			med = l;
		}
		if(sm != l){
			count++;
			sm = l;
		}
		System.out.println(count);
		
	}

}
