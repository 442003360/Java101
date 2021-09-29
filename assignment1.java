

//Mohammad Ali Hashem Alayafi
//S442003360
//your grade is 1/5
//@ change class name Main to match file name assignment1 ( Golden rule )
public class Main
{
	public static void main(String[] args) {
		//@ import the scanner at ( line 1 )
		Scanner s = new Scanner(System.in);
		System.out.print("please enter the first Number:");
		float a = s.nextInt();
     	System.out.println("please enter the second Number:");
		float b = s.nextFloat();
		float add = a+b;
		float sub=a-b;
		float multiply = a*b;
		float div =a/b;
		System.out.println(add);
		System.out.println(sub);
		System.out.println(multiply);
		System.out.println(div);
	}
  
  }
