import java.util.Scanner;


public class Main
{
	public static void main( String args[] )
	{
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter 1st monster's name: ");
		String name1= keyboard.nextLine();
    System.out.print("Enter 1st monster's size: ");
    int s1= keyboard.nextInt();
      keyboard.nextLine();
    System.out.print("Enter 2nd monster's name: ");
    String name2= keyboard.nextLine();
		System.out.print("Enter 2nd monster's size: ");
		int s2= keyboard.nextInt();
    	
		
    Monster m1= new Monster(name1, s1);
    Monster m2= new Monster(name2, s2);

    boolean b1 =false;
    b1 = m1.isBigger(m2);
    boolean b2 = false;
    b2 = m1.isSmaller(m2);
    boolean b3 = false;
    b3 = m1.namesTheSame(m2);

    System.out.println(name1+" "+s1);
    System.out.println(name2+" "+s2);
    if ( b1 == true)
    System.out.println("Monster one is bigger than Monster two.");
    if ( b2 == true)
    System.out.println("Monster one is smaller than Monster two.");
    if ( b3 == true)
    System.out.println("Monster one has the same name as Monster two.");


	}
}