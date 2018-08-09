
import java.util.Scanner;
public class harfnotunubulanprogram {
	

	

	
		    private static Scanner input;

			public static void main(String [] args) {
		    double genelortalama;
		    System.out.println("lütfen vize notunu Giriniz:");
			input = new Scanner(System.in);
			int vize=input.nextInt();
			System.out.println("lütfen final notunu Giriniz:");
			
			int fýnal=input.nextInt();
			genelortalama=(double)(vize*0.4+fýnal*0.6);
			System.out.println("genel ortalamanýz =");
			System.out.println(genelortalama);
			if(genelortalama>=95)
				{
				System.out.println("harf notunuz=AA");
				}
			else if(genelortalama>=80)
			{
			    System.out.println("Harf notunuz=BA");
		}
			else if(genelortalama>=70)
			{
			    System.out.println("Harf notunuz=BB");
		}
			else if(genelortalama>=65)
			{
			    System.out.println("Harf notunuz=CB");
		}
			else if(genelortalama>=60)
			{
			    System.out.println("Harf notunuz=CC");
		}
			else if(genelortalama>=55)
			{
			    System.out.println("Harf notunuz=DC");
		}
			else if(genelortalama>=50)
			{
			    System.out.println("Harf notunuz=DD");
		}
			else
			{
				System.out.println("ÜZGÜNÜZ DÖNEMÝNÝZ UZADI ");
			}
		
		
	}
		

	}



