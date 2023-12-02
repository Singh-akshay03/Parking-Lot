package Models;

import java.util.List;

public class ParkingLot extends BaseEntity{
    private List<Floor> floors;
    private String address;
    private List<Gate> gates;
    private ParkingLotStatus parkingLotStatus;


    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Gate> getGates() {
        return gates;
    }

    public void setGates(List<Gate> gates) {
        this.gates = gates;
    }
}
