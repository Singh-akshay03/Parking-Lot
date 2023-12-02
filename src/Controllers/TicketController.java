package Controllers;

import DTO.GenerateTicketRequestDto;
import DTO.GenerateTicketResponseDto;
import Exceptions.NoParkingSpotFoundException;
import Models.Gate;
import Models.Ticket;
import Models.Vehicle;
import Services.TicketService;

public class TicketController {
    TicketService ticketService;
    public GenerateTicketResponseDto generateTicket(GenerateTicketRequestDto generateTicketRequestDto) throws NoParkingSpotFoundException {
        Ticket ticket=ticketService.
                generateTicket(generateTicketRequestDto.getGateId(),
                        generateTicketRequestDto.getVehicleNumber(),
                        generateTicketRequestDto.getVehicleType());
        GenerateTicketResponseDto responseDto=new GenerateTicketResponseDto();
        responseDto.setTicket(ticket);
        return responseDto;
    }
}
