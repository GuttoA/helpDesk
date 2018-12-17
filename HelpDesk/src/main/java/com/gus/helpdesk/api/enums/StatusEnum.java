package com.gus.helpdesk.api.enums;

public enum StatusEnum {
	
	New,
	Assigned,
	Resolved,
	Approved,
	Disapproved,
	Closed;
	
	//Metoda para capturar o texto conforme a string passada
	public static StatusEnum getStatus(String status) {
		switch (status) {
		case "New": return New;
		case "Assigned": return Assigned;
		case "Resolved": return Resolved;
		case "Approved": return Approved;
		case "Disapproved": return Disapproved;
		case "Closed": return Closed;
		default: return New;
		}
	}

}
