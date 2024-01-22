package dbobjects;

import java.io.File;
import java.util.List;

public class Ticket {

	private String ticketId;
	private String category;
	private String issueDetails;
	private File supportingProof;
	private List<TicketComment> ticketComments;

	public enum ticketStatus {
		CREATED, ACKNOWLEDGED, INPROGRESS, AWAITING_USER_RESPONSE, RESOLVED_AWAITING_USER_RESPONSE, CLOSED
	}

	public String getTicketId() {
		return ticketId;
	}

	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getIssueDetails() {
		return issueDetails;
	}

	public void setIssueDetails(String issueDetails) {
		this.issueDetails = issueDetails;
	}

	public File getSupportingProof() {
		return supportingProof;
	}

	public void setSupportingProof(File supportingProof) {
		this.supportingProof = supportingProof;
	}

	public List<TicketComment> getTicketComments() {
		return ticketComments;
	}

	public void setTicketComments(List<TicketComment> ticketComments) {
		this.ticketComments = ticketComments;
	};

}
