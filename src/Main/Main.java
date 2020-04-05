package Main;

import Barrier.Course;
import Barrier.Road;
import Barrier.Wall;
import Interface.PropertyForBarrier;
import Interface.PropertyForParticipant;
import TypeObjects.Cat;
import TypeObjects.Human;
import TypeObjects.Robot;
import TypeObjects.Team;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){

        Course course = new Course(new PropertyForBarrier[]
            {
                new Road(3),
                new Road(1.5),
                new Road(2.12),
                new Road(3.43),
                new Road(4.65),
                new Road(5.3),
                new Wall(7),
                new Wall(11),
                new Wall(3.12),
                new Wall(17.43),
                new Wall(2.65),
                new Wall(20.3)
            });


        Team[] teams = new Team[3];
        teams[0] = new Team("Number1", new PropertyForParticipant[]{
                new Human("Dmitriy",21.5,6.05),
                new Human("Evgeniy",15.75,4.35),
                new Cat("Tom",2.25,7.18),
                new Robot("MMA-6000",53.11,9)
        });
        teams[1] = new Team("Winners", new PropertyForParticipant[]{
                new Human("Kevin",12.5,5.05),
                new Human("Memin",16.75,3.35),
                new Cat("Pup",1.25,9.18),
                new Robot("JK-222",33.11,11)
        });
        teams[2] = new Team("Kekovs", new PropertyForParticipant[]{
                new Human("Lolik",20.5,4.05),
                new Human("Polik",14.75,5.35),
                new Cat("Frank",3.25,8.18),
                new Robot("PKS-124 ",43.11,10)
        });

        for(Team team : teams){
            course.dolt(team);
        }

        for(Team team : teams){
           team.ShowResultAll();
        }
    }
}
