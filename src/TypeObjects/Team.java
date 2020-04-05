package TypeObjects;

import Interface.PropertyForParticipant;

public class Team {
    private String nameTeam = "";
    private PropertyForParticipant[] participant;

    public Team(String nameTeam, PropertyForParticipant[] participant) {
            this.nameTeam = nameTeam;
            this.participant = participant;
    }

    public PropertyForParticipant[] getParticipant() {
        return participant;
    }

    public String getNameTeam() {
        return nameTeam;
    }

    public void ShowResultAll(){
        for(PropertyForParticipant forParticipant : participant){
            if(forParticipant.getSuccess()){
                System.out.println("Участни " + forParticipant.getName() + " из команды " + nameTeam + " преодалел всю дистанцию! Его максимум в беге - " +
                        forParticipant.getMaxRun() + " и в прыжке - " + forParticipant.getMaxJump());
            }else{
                System.out.println("Участни " + forParticipant.getName() + " из команды " + nameTeam + " не смог преодалеть всю дистанцию! Его максимум в беге - " +
                        forParticipant.getMaxRun() + " и в прыжке: " + forParticipant.getMaxJump());
            }
        }
    }

    public void ShowResultOnlyWin(){
        for(PropertyForParticipant forParticipant : participant){
            if(forParticipant.getSuccess()) {
                System.out.println("Участни " + forParticipant.getName() + " из команды " + nameTeam + " преодалел всю дистанцию! Его максимум в беге - " +
                        forParticipant.getMaxRun() + " и в прыжке - " + forParticipant.getMaxJump());
            }
        }
    }
}
