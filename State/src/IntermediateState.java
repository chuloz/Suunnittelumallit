public class IntermediateState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("Training... Gaining experience.");
        character.gainExperience(20);
        if (character.getExperiencePoints() >= 100) {
            System.out.println("Congratulations! You have advanced to Expert level.");
            character.setState(new ExpertState());
        }
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("Meditating... Gaining health.");
        character.gainHealth(10);
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("Intermediate cannot fight yet.");
    }
}
