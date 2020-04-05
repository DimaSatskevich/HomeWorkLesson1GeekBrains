package Barrier;

import Interface.MovementThroughObject;
import Interface.PropertyForBarrier;
import Interface.PropertyForParticipant;
import TypeObjects.Team;

import java.util.ArrayList;

public class Course {
    private PropertyForBarrier[] forBarrier;

    public Course(PropertyForBarrier[] forBarrier) {
        this.forBarrier = forBarrier;
    }

    public void dolt(Team team){
        PropertyForParticipant[] participant = team.getParticipant();
        for(PropertyForParticipant typeParticipant : participant){
            boolean isSuccess = true;
            for(PropertyForBarrier barrier : forBarrier){
                if(barrier.getClass().equals(Road.class) && !typeParticipant.jump(barrier.getDistance())){
                    isSuccess = false;
                    break;
                }else if(barrier.getClass().equals(Wall.class) && !typeParticipant.run(barrier.getDistance())){
                    isSuccess = false;
                    break;
                }
            }
            typeParticipant.setSuccess(isSuccess);
        }
    }
}
