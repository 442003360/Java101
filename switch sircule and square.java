import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner gdi = new Scanner(System.in);
	    int i = gdi.nextInt();
	    System.out.println("Enter heghi");
	    
	    int heghi = gdi.nextInt();
	    System.out.println("Enter offer");
	    float offerr= gdi.nextFloat();
	    float ridusius =3.14F;
	    switch (heghi) {
	        case 1:
	            System.out.println(heghi*offerr);
	            break;
	            case 2:
	                System.out.println(ridusius*ridusius* heghi);
	                break;
	    }
		
	}
}
