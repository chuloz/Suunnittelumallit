public class ExpertState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... Gaining more experience.");
        character.gainExperience(30);
        if (character.getExperiencePoints() >= 150) {
            System.out.println("Congratulations! You have advanced to Master level.");
            character.setState(new MasterState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditating... Gaining health.");
        character.gainHealth(15);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Fighting... Losing health but gaining experience.");
        character.loseHealth(20);
        character.gainExperience(40);
        if (character.getHealthPoints() <= 0) {
            System.out.println("You have no health left. Game over.");
        }
    }
}
