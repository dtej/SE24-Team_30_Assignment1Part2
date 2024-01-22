package manager;

import java.io.File;
import java.util.List;

import dbobjects.Ticket;
import dbobjects.User;

public class SupportManager {

	private List<File> supportDocuments;

	public List<File> getSupportDocuments() {
		return supportDocuments;
	}

	public void setSupportDocuments(List<File> supportDocuments) {
		this.supportDocuments = supportDocuments;
	}

	// For creating a new ticket
	String createTicket(Ticket ticket, User user) {
		// To Do
		return null;
	}

	// For getting the ticket details
	String getTicketDetails(String ticketId) {
		// To Do
		return null;
	}

	// For updating the ticket
	String updateTicket(Ticket ticket) {
		// To Do
		return null;
	}

}
