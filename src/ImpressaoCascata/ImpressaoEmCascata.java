package ImpressaoCascata;

public class ImpressaoEmCascata {
	public static void main(String[] args) {
		int n = 10;
		int num = 0;
		for(int i=1;i <= n;i++ ){
			num = i;
			for(int j=1;j <= i ;j++){
				System.out.print(" "+ num);
				num+=i;
			}
			System.out.println("");
		}
	}
}
