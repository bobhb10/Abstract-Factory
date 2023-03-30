package Proiect;

//fabrica unde sunt alese diferite tipuri de tren

public class TrainFactory extends TicketFactory {

	@Override
	Train getTrain(String train) {
		if(train==null) {
			return null;
		}
		if("Regio".equals(train)) {
			return new Regio();
		}else if("InterRegio".equals(train)) {
			return new InterRegio();
		}else if("InterCity".equals(train)) {
			return new InterCity();
		}
		return null;
	}

	@Override
	Location getLocation(String location) {
		return null;
	}
	
}
