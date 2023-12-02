package Services;

import Exceptions.NoParkingSpotFoundException;
import Models.*;
import Repositories.TicketRepository;

import java.util.Date;
import java.util.UUID;

public class TicketService {
    private VehicleService vehicleService;
    private GateService gateService;
    private ParkingLotService parkingLotService;
    private ParkingSpotService parkingSpotService;
    private TicketRepository ticketRepository;
    public Ticket generateTicket(Long gateId, String vehicleNumber, VehicleType vehicleType) throws NoParkingSpotFoundException {
        Vehicle vehicle=vehicleService.getVehicle(vehicleNumber);
        if(vehicle==null){
            vehicle=vehicleService.addVehicle(vehicleNumber,vehicleType);
        }
        Gate gate=gateService.getGate(gateId);

        ParkingSpot parkingSpot=parkingLotService.getParkingSpot(vehicle,gate);
        if(parkingSpot==null){
            throw new NoParkingSpotFoundException("No parking spot available");
        }
        parkingSpot=parkingSpotService.assignSpot(parkingSpot);

        Ticket ticket=new Ticket();
        ticket.setGate(gate);
        ticket.setParkingSpot(parkingSpot);
        ticket.setVehicle(vehicle);
        ticket.setOperator(gate.getOperator());
        ticket.setEntryTime(new Date());
        ticket.setId(new UUID(5,3));
        ticketRepository.saveTicket(ticket);
        return ticket;
    }
}
