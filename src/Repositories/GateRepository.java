package Repositories;

import Models.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Long, Gate> getStore;
    public GateRepository(){
        this.getStore=new HashMap<>();
    }
    public Gate getGate(Long gateId){
        return getStore.get(gateId);
    }
}
