import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner srt = new Scanner(System.in);
		System.out.println("Entare darag");
		int darag;
		darag = srt.nextInt();
		
		if(darag>=90&&darag<100){System.out.println("A");}
		else if (darag>=80&&darag<90){System.out.println("B");}
		else if(darag>=70&&darag<80){System.out.println("C");}
		else if(darag>=60&&darag<70){System.out.println("D");}
		else System.out.println("F");
		
	}
}
