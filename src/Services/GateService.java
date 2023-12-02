package Services;

import Models.Gate;
import Repositories.GateRepository;

public class GateService {
    private GateRepository gateRepository;
    public Gate getGate(Long gateId){
        return gateRepository.getGate(gateId);
    }
}
