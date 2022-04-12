package FirstQuarter.Java2.Lesson1;

public class Wall implements Obstacles {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean canJump(Participant jumpParticipant) {
        return jumpParticipant.jump() >= height;
    }
}
