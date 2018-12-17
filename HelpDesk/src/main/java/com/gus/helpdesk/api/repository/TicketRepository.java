package com.gus.helpdesk.api.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.mongodb.repository.MongoRepository;

import com.gus.helpdesk.api.entity.Ticket;

public interface TicketRepository extends MongoRepository<Ticket, String> {
	
	/*Todos os metodos vao retornar um objeto do tipo Page por que vamos usar paginacao*/
	
	Page<Ticket> findByUserIdOrderByDateDesc(Pageable pages, String userId); //Pesquisa pelo Id do usuario
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityOrderByDateDesc(
			String title, String status, String priority, Pageable pages);//Retornar um title com base nos filtros passados ordenando pela data desc
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusIgnoreCaseContainingAndPriorityAndUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pages); //Vai retornar somente os tickets daquele usuario(UserId)
	
	Page<Ticket> findByTitleIgnoreCaseContainingAndStatusAndPriorityAndAssignedUserIdOrderByDateDesc(
			String title, String status, String priority, Pageable pages); //Vai retornar somente os tickets daquele tecnico(AssignedUserId),atribuidos a ele

	Page<Ticket> findByNumber(Integer number, Pageable pages); //Eh gerado um numero aleatorio, sendo assim podemos usar esse metodo para fazer
	                                                           // a pesquisa pelo numero
	
}
