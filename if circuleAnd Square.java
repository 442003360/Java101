import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner srt = new Scanner(System.in);
	    System.out.println("squr");
	    System.out.println("Enteer heghi");
	    
	    
	    float heghi=srt.nextFloat();
	     System.out.println("Enteer ofeer");
	    float offeer = srt.nextFloat();
	    
	    if(heghi>=0){System.out.println(heghi*offeer);};
	    System.out.println("Circle");
	    
	    float radius=3.14f;
	    System.out.println("Ente Hi");
	    float Hi=srt.nextFloat();
	    if(Hi>0){System.out.println(radius*radius*Hi);};
	    
	    
		
	}
}
