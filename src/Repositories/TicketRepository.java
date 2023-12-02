package Repositories;

import Models.Ticket;

import java.util.HashMap;
import java.util.Map;

public class TicketRepository {
    Map<Long,Ticket> ticketStore;
    public TicketRepository(){
        ticketStore=new HashMap<>();
    }
    public void saveTicket(Ticket ticket) {
        ticketStore.put(ticket.getId(),ticket);
    }
}
