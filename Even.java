import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	   System.out.println("entar number");
	   Scanner srt = new Scanner(System.in);
	   int num = srt.nextInt();
	   num =num%=2;
	   if(num==0){System.out.println("even");}
	   else System.out.println("odd");
		
	}
}
