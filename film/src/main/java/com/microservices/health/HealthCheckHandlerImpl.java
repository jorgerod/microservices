package com.microservices.health;

import org.springframework.stereotype.Component;

import com.netflix.appinfo.HealthCheckHandler;
import com.netflix.appinfo.InstanceInfo.InstanceStatus;

@Component
public class HealthCheckHandlerImpl implements HealthCheckHandler {

    private int counter = 0;
    
    @Override
    public InstanceStatus getStatus(InstanceStatus arg0) {
        counter ++;
        
        switch (counter) {
        case 0:
            return InstanceStatus.OUT_OF_SERVICE;
        case 1:
            return InstanceStatus.DOWN;
        case 2:
            return InstanceStatus.STARTING;
        case 3:
            return InstanceStatus.UNKNOWN;
        default:
            return InstanceStatus.UP;
        }
    }

}
