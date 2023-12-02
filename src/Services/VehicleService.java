package Services;

import Models.Vehicle;
import Models.VehicleType;
import Repositories.VehicleRepository;

public class VehicleService {
    private VehicleRepository vehicleRepository;
    public VehicleService(VehicleRepository vehicleRepository){
        this.vehicleRepository=vehicleRepository;
    }
    public Vehicle getVehicle(String vehicleNumber){
        return vehicleRepository.getVehicle(vehicleNumber);
    }
    public Vehicle addVehicle(String vehicleNumber, VehicleType vehicleType){
        return vehicleRepository.addVehicle(new Vehicle(vehicleNumber,vehicleType));
    }
}
