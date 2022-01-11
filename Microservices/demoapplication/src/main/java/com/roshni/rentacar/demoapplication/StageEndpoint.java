package com.roshni.rentacar.demoapplication;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component // create beans
@Endpoint(id = "stage") //auto expose endpoints
public class StageEndpoint {

    Map<String, Stage> stages = new ConcurrentHashMap<>();


    //retrun all the stages what we have
    @ReadOperation
    public Map<String, Stage> getAllStages(){
        return stages;
    }

    //get stage name and return the stage value
    @ReadOperation
    public Stage getStage(@Selector String name){
        return stages.get(name);
    }

    @WriteOperation
    public void setValue(@Selector String name, int stage){
        stages.put(name, new Stage(stage));

    }

    static class Stage{
        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }
}
