import java.util.Scanner;
public class Mid
{
	public static void main(String[] args) {
	    		System.out.println("Entar num");

		
		
		Scanner srt = new Scanner(System.in);
		

		String name=srt.nextLine();
			System.out.println("Entar birth");
		int age = srt.nextInt();
		
		System.out.println(2021-age);
		 if (age>=40){System.out.println(name  +" "+  age);}
		
		else if (age>=30&&age<=39){System.out.println(name  +" "+  age);}
		
		
	
	else System.out.println(name  +""+  age);
		
		
		
	}
}
