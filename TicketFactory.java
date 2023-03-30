package Proiect;

//fabrica unde sunt combinate trenurile si locatiile intr-o singura clasa pentru a realiza biletul

public abstract class TicketFactory {
	abstract Train getTrain(String train);
	abstract Location getLocation(String location);
}
