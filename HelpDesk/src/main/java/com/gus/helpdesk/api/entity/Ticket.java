package com.gus.helpdesk.api.entity;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import com.gus.helpdesk.api.enums.PriorityEnum;
import com.gus.helpdesk.api.enums.StatusEnum;

@Document
public class Ticket {
	
	@Id
	private String id;
	
	@DBRef(lazy = true)
	private User user; //Usuario que criou o ticket
	
	private Date date; //Data de abertura do ticket
	
	private String title;
	
	private Integer number; //Facilitar na operacao para ser identificado melhor,facilitar nas pesquisas
	
	private StatusEnum status; //Status do ticket se esta aberto,assinado,fechado, dentre outros...
	
	private PriorityEnum priority;
	
	@DBRef(lazy = true)
	private User assignedUser; //Quando um tecnico aceitar esse usuario vai estar atribuido a ele
	
	private String description;
	
	private String image; //Imagem do erro(problema) a ser anexado
	
	@Transient
	private List<ChangeStatus> changes; //Reprensenta as alteracoes dos status, transient pq n precisa ser persistido na base
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public StatusEnum getStatus() {
		return status;
	}

	public void setStatus(StatusEnum status) {
		this.status = status;
	}

	public PriorityEnum getPriority() {
		return priority;
	}

	public void setPriority(PriorityEnum priority) {
		this.priority = priority;
	}

	public User getAssignedUser() {
		return assignedUser;
	}

	public void setAssignedUser(User assignedUser) {
		this.assignedUser = assignedUser;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public List<ChangeStatus> getChanges() {
		return changes;
	}

	public void setChanges(List<ChangeStatus> changes) {
		this.changes = changes;
	}
	
	
	

}
