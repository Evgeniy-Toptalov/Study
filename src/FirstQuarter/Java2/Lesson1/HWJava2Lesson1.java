package FirstQuarter.Java2.Lesson1;

public class HWJava2Lesson1 {

    public static void main(String[] args) {
        Participant human = new Human("Ivan");
        Participant cat = new Cat("Barsik");
        Participant robot = new Robot(1000);

        Treadmill treadmill = new Treadmill(150);
        Wall wall = new Wall(2);

        Participant[] arrParticipant = {human, cat, robot};
        Obstacles[] arrObstacles = {treadmill, wall};

        crossObstacles(treadmill, wall, arrParticipant);
    }

    public static void crossObstacles(Treadmill treadmill, Wall wall, Participant[] arrParticipant) {
        for (Participant capabilities : arrParticipant) {
            System.out.println(capabilities + " cможет ли добежать до конца дорожки?");
            System.out.println(treadmill.canRun(capabilities));
            if (treadmill.canRun(capabilities) == true) {
                System.out.println(capabilities + " cможет ли перепрыгнуть стену?");
                System.out.println(wall.canJump(capabilities));
            } else {
                System.out.println(capabilities + " не прошёл испытание и сошёл с дистанции");
            }
        }
    }
}





