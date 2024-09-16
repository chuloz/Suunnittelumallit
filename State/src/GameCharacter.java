public class GameCharacter {
    private String name;
    private int experiencePoints;
    private int healthPoints;
    private State state;

    public GameCharacter(String name) {
        this.name = name;
        this.experiencePoints = 0;
        this.healthPoints = 100;
        this.state = new NoviceState();
    }


    public int getExperiencePoints() {
        return experiencePoints;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void gainExperience(int points) {
        this.experiencePoints += points;
    }

    public void gainHealth(int points) {
        this.healthPoints += points;
    }

    public void loseHealth(int points) {
        this.healthPoints -= points;
    }

    public void setState(State state) {
        this.state = state;
    }

    public void train() {
        state.train(this);
    }

    public void meditate() {
        state.meditate(this);
    }

    public void fight() {
        state.fight(this);
    }

    public void displayStatus() {
        System.out.println("Name: " + name);
        System.out.println("Experience: " + experiencePoints);
        System.out.println("Health: " + healthPoints);
        System.out.println("Current State: " + state.getClass().getSimpleName());
    }
}
