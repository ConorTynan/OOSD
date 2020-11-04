package Revision;

import java.util.*;
public class Library 
{
	public static void main(String[] args)
	{
		Book[] books=new Book[3];
		Scanner input=new Scanner(System.in);
		for (int i=0;i<=2;i++)
		{
			System.out.println("Enter title:");
			String title=input.nextLine();
			System.out.println("Enter author:");
			String author=input.nextLine();
			System.out.println("Enter no. of pages:");
			int noOfPages=input.nextInt();
		
			Book b=new Book(title, author, noOfPages);
			books[i]=b;
		}
		for(Book b:books)
		{
			if(b!=null)System.out.println(b.toString());
		}
		books[1].borrow();
		for(Book b:books)
		{
			if(b!=null)System.out.println(b.toString());
		}
		books[1].BookReturn();
		for(Book b:books)
		{
			if(b!=null)System.out.println(b.toString());
		}
		input.close();
	}
}