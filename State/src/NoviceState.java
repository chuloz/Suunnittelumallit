public class NoviceState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... Gaining experience.");
        character.gainExperience(10);
        if (character.getExperiencePoints() >= 50) {
            System.out.println("Congratulations! You have advanced to Intermediate level.");
            character.setState(new IntermediateState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Novice cannot meditate yet.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Novice cannot fight yet.");
    }
}
