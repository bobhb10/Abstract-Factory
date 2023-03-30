package Proiect;

//fabrica unde sunt alese diferite locatii din Romania

public class LocationFactory extends TicketFactory{

	@Override
	Train getTrain(String train) {
		return null;
	}

	@Override
	Location getLocation(String location) {
		if(location==null) {
			return null;
		}
		if("Bucuresti".equals(location)) {
			return new Bucuresti();
		}else if("Cluj_Napoca".equals(location)) {
			return new Cluj_Napoca();
		}else if("Constanta".equals(location)) {
			return new Constanta();
		}else if("Iasi".equals(location)) {
			return new Iasi();
		}else if("Timisoara".equals(location)) {
			return new Timisoara();
		}else if("Craiova".equals(location)) {
			return new Craiova();
		}else if("Brasov".equals(location)) {
			return new Brasov();
		}
	return  null;
	}

}
