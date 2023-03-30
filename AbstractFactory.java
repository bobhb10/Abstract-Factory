package Proiect;

//fabrica unde se face diferenta intre trenuri si locatii si  este prima fabrica apelata de program

public  class AbstractFactory {
	public static TicketFactory getTicket(String choice) {
		if("Train".equals(choice)) {
			return new TrainFactory();
		}else if("Location".equals(choice)) {
			return new LocationFactory();
		}
	 return null;
	}
}
