import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner srt = new Scanner(System.in);
		System.out.println("the fristnumber");
		float x=srt.nextFloat();
		System.out.println("the sceend number");
		float y = srt.nextFloat();
		System.out.println("number three");
		float r = srt.nextFloat();
		if(x>y && x>r){System.out.println(x);}
		else if(y>x&&y>r){System.out.println(y);}
		else if(r>x && r>y){System.out.println(r);}
		else System.out.println("bay");
}
}
