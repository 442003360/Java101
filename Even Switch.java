import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner srt = new Scanner(System.in);
	    System.out.println("Enter nuber");
	    int num=srt.nextInt();
	    num =num%=2;
	    
	    switch(num){
	        case 1:
	            System.out.println("odd");
	            break;
	            case 0:
	                System.out.println("even");
	                break;
	    }
	    
	}
}
