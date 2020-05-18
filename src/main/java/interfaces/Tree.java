package interfaces;

public abstract class Tree {
        private boolean smellGood = true;

        public abstract int countLeaves();

    @Override
    public String toString() {
        return "I'm a Tree not ant!";
    }
}
