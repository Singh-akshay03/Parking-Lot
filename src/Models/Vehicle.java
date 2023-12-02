package Models;

public class Vehicle extends BaseEntity {
    private VehicleType vehicleType;
    private String number;

    public Vehicle(String vehicleNumber, VehicleType vehicleType) {
        super();
        this.number=vehicleNumber;
        this.vehicleType=vehicleType;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
