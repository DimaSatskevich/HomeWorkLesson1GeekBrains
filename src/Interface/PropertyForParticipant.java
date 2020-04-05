package Interface;

public interface PropertyForParticipant extends MovementThroughObject{
    void setSuccess(boolean success);
    boolean getSuccess();
    String getName();
    double getMaxRun();
    double getMaxJump();
}
