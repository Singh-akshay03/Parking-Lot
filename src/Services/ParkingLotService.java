package Services;

import Models.Gate;
import Models.ParkingSpot;
import Models.Vehicle;
import Repositories.ParkingLotRepository;
import Strategies.RandomSpotAssignment;

public class ParkingLotService {
    private RandomSpotAssignment randomSpotAssignment;
    private ParkingLotRepository parkingLotRepository;
    public ParkingLotService(RandomSpotAssignment randomSpotAssignment){
        this.randomSpotAssignment=randomSpotAssignment;
    }
    public ParkingSpot getParkingSpot(Vehicle vehicle, Gate gate) {
        return randomSpotAssignment.spotAssignmentStrategy(vehicle.getVehicleType(),gate,
                parkingLotRepository.getAllParkingSpot());
    }
}
