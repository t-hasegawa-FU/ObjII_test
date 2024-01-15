public class Main{
	public static void main(String[] args){
		int num = Integer.parseInt(args[0]);
		int res = 1;
		for(int i=1;i<=num;i++){
			res *= i;
		}
		System.out.println("階乗=" + res);
	}
}