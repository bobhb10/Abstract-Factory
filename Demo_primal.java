package Proiect;

import java.util.Scanner;

public class Demo_primal {
	private static Scanner myInput;

	public static void main(String[] args) throws Exception{
		TicketFactory locationFactory=AbstractFactory.getTicket("Location");
		TicketFactory trainFactory=AbstractFactory.getTicket("Train");
		Location location = null;
		Train train = null;

		
		int flag=1;
		while(flag==1)
		{
			myInput=new Scanner(System.in);
			System.out.println("Bun venit la compania de transport feroviar de persoane ,CFR Calatori!");
		
			System.out.println("Alegeti destinatia:");
			System.out.println("1.Bucuresti");
			System.out.println("2.Cluj-Napoca");
			System.out.println("3.Constanta");
			System.out.println("4.Iasi");
			System.out.println("5.Timisoara");
			System.out.println("6.Craiova");
			System.out.println("7.Brasov");
			
			System.out.println("Alegerea dumneavoastra:");
			int indexLocation=myInput.nextInt();
			
			System.out.println("Alegeti trenul:");
			System.out.println("1.InterRegio");
			System.out.println("2.Regio");
			System.out.println("3.InterCity");
			
			System.out.println("Alegerea dumneavoastra:");
			int indexTrain=myInput.nextInt();
			
			//indexLocation este atribuit unei locatii prin numarul de ordine pentru a se selecta locatia dorita
			switch(indexLocation) {
			case 1:
				location=locationFactory.getLocation("Bucuresti");
				break;
			 
			case 2:
				location=locationFactory.getLocation("Cluj_Napoca");
				break;
				
			case 3:
				location=locationFactory.getLocation("Constanta");
				break;
				
			case 4:
				location=locationFactory.getLocation("Iasi");
				break;
			case 5:
				location=locationFactory.getLocation("Timisoara");
				break;
			case 6:
				location=locationFactory.getLocation("Craiova");
				break;
			case 7:
				location=locationFactory.getLocation("Brasov");
				break;
			}
			
			//indexTrain este  atribuit unui tren prin numarul de ordine pentru a se selecta trenul dorit
			switch(indexTrain) {
			case 1:
				train=trainFactory.getTrain("InterRegio");
				break;
			
			case 2:
				train=trainFactory.getTrain("Regio");
				break;
				
			case 3:
				train=trainFactory.getTrain("InterCity");
				break;
			}
			
			//este afisat biletul ales
			System.out.println("Serviciul de tren ales de dumneavoastra este "+ train.type_train());
			System.out.println("Train- "+train.type_train()+" to "+ location.ride() );
			System.out.println("Doriti retur?");
			System.out.println("1:Da 0:Nu");
			
			flag=myInput.nextInt();
			if(flag==0) {
				System.out.println("Doriti o alta destinatie de calatorie?");
				System.out.println("1:Da 0:Nu");
				flag=myInput.nextInt();

				if(flag==0)
				{
					System.out.println("Multumim ca ati ales serviciile noastre.O zi minunata!");
				}

	}
   }
}
}
