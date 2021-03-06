package TypeObjects;

import Interface.Movement;
import Interface.PropertyForParticipant;

public class Human implements Movement, PropertyForParticipant {

    public String name = "";
    private double maxRun = 0;
    private double maxJump = 0;
    private boolean isSuccessDistance = false;

    public Human(String name, double maxRun, double maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public void run() {
        System.out.println("Человек " + name + " пробежал");
    }

    @Override
    public void jump() {
        System.out.println("Человек " + name + " прыгнул");
    }

    @Override
    public boolean run(double distance) {
        boolean success = false;
        if(maxRun >= distance){
            System.out.println("Человек " + name + " успешно пробежал дистанцию " + distance);
            success = true;
        }else{
            System.out.println("Человек " + name + " не смог пробежать дистанцию " + distance + " поскольку его максимум " + maxRun);
            success = false;
        }

        return success;
    }

    @Override
    public boolean jump(double height) {
        boolean success = false;
        if(maxJump >= height){
            System.out.println("Человек " + name + " успешно перепрыгнул стену " + height);
            success = true;
        }else{
            System.out.println("Человек " + name + " не смог перепрыгнуть стену " + height + " поскольку его максимум " + maxJump);
            success = false;
        }

        return success;
    }

    @Override
    public void setSuccess(boolean success) {
        isSuccessDistance = success;
    }

    @Override
    public boolean getSuccess() {
        return isSuccessDistance;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public double getMaxRun() {
        return maxRun;
    }

    @Override
    public double getMaxJump() {
        return maxJump;
    }
}
