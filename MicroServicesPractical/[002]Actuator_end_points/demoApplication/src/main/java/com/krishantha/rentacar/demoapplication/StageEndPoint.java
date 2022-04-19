package com.krishantha.rentacar.demoapplication;

import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// when we annotate something with the component , it creates the bean
// can use Component or Service or Repository. Bz service or repository extends from the component
@Component
@Endpoint(id = "stage")
public class StageEndPoint {

    Map<String,Stage> stages = new ConcurrentHashMap<>();

    // return all the stage map we have
    // HTTP Get call come and map here
    @ReadOperation
    public Map<String,Stage> getAllStages(){
        return stages;
    }

    // take the stage name and return the stage value
    @ReadOperation
    public Stage getStage(@Selector String name){
        return stages.get(name);
    }

    // set the stage value
    @WriteOperation
    public void setValue(@Selector String name, Stage stage){
        stages.put(name,stage);
    }
    public class Stage {
        /*
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

         */

        String value;
        public Stage(String value){
            this.value = value;
        }
        public String getValue(){
            return value;
        }
        public void setValue(String value){
            this.value=value;
        }

    }


}


