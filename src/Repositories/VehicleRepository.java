package Repositories;

import Models.Vehicle;
import Models.VehicleType;

import java.util.HashMap;
import java.util.Map;

public class VehicleRepository {
    Map<String,Vehicle> vehicleStore;
    public VehicleRepository(){
        vehicleStore=new HashMap<>();
    }
    public Vehicle getVehicle(String vehicleNumber) {
        return vehicleStore.get(vehicleNumber);
    }

    public Vehicle addVehicle(Vehicle vehicle){
        vehicleStore.put(vehicle.getNumber(),vehicle);
        return vehicleStore.get(vehicle.getNumber());
    }
}
