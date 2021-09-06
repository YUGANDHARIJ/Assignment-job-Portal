package com.job.portal;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Iterator;



public class Company 
{

	public static void main(String[] args) 
	{
		
		Scanner scan= new Scanner(System.in);
		int count=0;
		List <Candiadate>candiadtelist = new ArrayList();
		System.out.println("ENTER THE NUMBER OF EMPLOYEES");
		int N=scan.nextInt();
		for(int i=0;i<N;i++) {
		System.out.println("ENTER THE NAME");
		String name=scan.next();
		System.out.println("ENTER THE GMAIL");
		String email=scan.next();
		System.out.println("ENTER THE GENDER");
		String gender=scan.next();
		System.out.println("ENTER THE UG_PERCENTAGE");
		float ugper=scan.nextFloat();
		System.out.println("ENTER THE  XII_PERCENTAEG");
		float XIIper=scan.nextFloat();
		System.out.println("ENTER THE  X_PERCENTAGE");
		float Xper=scan.nextFloat();
		System.out.println("ENTER THE GAP_IN_EDUCATION");
		int gapinedu=scan.nextInt();
		
		Candiadate candidate= new Candiadate(name,email,gender,ugper,XIIper,Xper,gapinedu);
		//Iterator <Candiadate>i = candiadtelist.iterator();
		//while(i.hasNext()) /i.remove();
		if(i==0) 
		 {
		   candiadtelist.add(candidate);
		 }
		  
		else 
		{
		  for(Candiadate candi: candiadtelist) 
		  {
			 if(candi.getGmail()!=candidate.getGmail()) 
			 {
				count++;
			 }
			
			   if(count==candiadtelist.size()) 
			   {
				candiadtelist.add(candidate);
				
			   }
			
		   }
		 }
	}
		for(Candiadate candi: candiadtelist) 
		{
				
				System.out.println(candi.getName());
				System.out.println(candi.getGmail());
				System.out.println(candi.getgender());
				System.out.println(candi.getUgper());
				System.out.println(candi.getXIIper());
				System.out.println(candi.getXper());
				System.out.println(candi.getGapinedu());
				
				
		}
		
		
		System.out.println("\nHERE THE ELIGIBLE CANDIDATES DETAILS ARE: ");
		Eligibility eg= new Eligibility();
		
		
		for(Candiadate candi: candiadtelist) 
		{
			if(candi.getUgper()>= eg.getUgper() && candi.getXIIper()>=eg.getXIIper() && candi.getXper() >= eg.getXper() && candi.getGapinedu()==eg.getGapinedu()  ) 
			{
				
				System.out.println("");

				
				System.out.println("NAME:  "+candi.getName());
				System.out.println("GMAIL: "+candi.getGmail());
				System.out.println("GENDER:  "+candi.getgender());
				System.out.println("UG_PERCENTAGE: "+candi.getUgper());
				System.out.println("XII_PERCENTAGE: "+candi.getXIIper());
				System.out.println("X_PERCENTAGE:  "+candi.getXper());
				System.out.println("GAP_IN_EDUCATION:  "+candi.getGapinedu());
				
				
		    }
	     }
		
   }

}

