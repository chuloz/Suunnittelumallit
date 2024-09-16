public class MasterState implements State {
    @Override
    public void train(GameCharacter character) {
        System.out.println("You are a master now. No need to train.");
    }

    @Override
    public void meditate(GameCharacter character) {
        System.out.println("You are a master now. No need to meditate.");
    }

    @Override
    public void fight(GameCharacter character) {
        System.out.println("You are a master now. No need to fight.");
    }
}
