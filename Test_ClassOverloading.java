package Basic;

import java.util.Scanner;

public class Test_ClassOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Area a=new Area();
		System.out.println("Enter the side of square:");
		Scanner read=new Scanner(System.in);
		int side=read.nextInt();
		Area a1=new Area(side);
		
		System.out.println("Enter length:");
		Scanner read1=new Scanner(System.in);
		int len=read1.nextInt();
		
		System.out.println("Enter breadth");
		Scanner read2=new Scanner(System.in);
		int bre=read2.nextInt();
		
		Area a2=new Area(len, bre);

	}

}
