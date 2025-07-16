package com.tka;

import java.time.LocalDate;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Management {
	
	public static void main(String[] args) {
		
		Configuration cfg=new Configuration();
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		SessionFactory sf=cfg.buildSessionFactory();
		Scanner sc=new Scanner(System.in);
		
		
		while(true)
		{
		
			System.out.println("1. Add student\n2. Search a student by id\n3. Delete a student\n4. Exit\n" );
			System.out.println("Choice:");
			int choice=sc.nextInt();
			
			
			if(choice==1)
			{
				System.out.println("Enter the id");
				int id=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the name");
				String name=sc.nextLine();
				
				System.out.println("Enter the email");
				String email=sc.nextLine();
				
				System.out.println("Enter phone no");
				int phone=sc.nextInt();
				sc.nextLine();
				
				System.out.println("Enter the year(YEAR-MM-DD1"
						+ "):");
				LocalDate year=LocalDate.parse(sc.nextLine());
				
				Student s1=new Student();
				s1.setEmail(email);
				s1.setId(id);
				s1.setName(name);
				s1.setPhone(phone);
				s1.setYear(year);
				
				
				Session session=sf.openSession();
				session.save(s1);
				session.beginTransaction().commit();
				session.close();
				System.out.println("Record added Succesfully");
				
			}
			else if(choice==2)
			{
				System.out.println("Search a student by id");
				int id=sc.nextInt();
				
				Session session=sf.openSession();
				Student s1=session.get(Student.class, id);
			
				
				session.close();	
				if(s1!=null)
				{
					System.out.println("Student:"+ s1);
				}
				else
				{
					System.out.println("Record not found");
				}
			}
			else if(choice==3)
			{
				System.out.println("Enter id to delete a record");
				int id=sc.nextInt();
				
				Session session=sf.openSession();
				Student s1=session.get(Student.class,id);
				if(s1!=null)
				{
					session.delete(s1);
					System.out.println("Student deleted");
				}
				else
				{
					System.out.println("Student not found");
				}
				session.beginTransaction().commit();
				session.close();
			}
			else if(choice==4)
			{
				
				sf.close();
				sc.close();
				System.out.println("Exiting the menu");
				break;
				
			}
			else
			{
				System.out.println("Invalid choice ");
			}	
		}
	}
}
