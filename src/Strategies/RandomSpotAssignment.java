package Strategies;

import Models.*;

import java.util.List;

public class RandomSpotAssignment implements SpotAssignmentStrategy{
    @Override
    public ParkingSpot spotAssignmentStrategy(VehicleType vehicleType, Gate gate,
                                              List<ParkingSpot> parkingSpotList) {
        for(ParkingSpot parkingSpot:parkingSpotList){
            if(parkingSpot.getParkingSpotStatus().equals(ParkingSpotStatus.AVAILABLE)&&
            parkingSpot.getSupportedVehicleType().contains(vehicleType)){
                return parkingSpot;
            }
        }
        return null;
    }
}
