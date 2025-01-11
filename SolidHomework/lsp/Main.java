package lsp;

/**
 * Refactor the code to ensure it adheres to LSP.
 */
public class Main {

    public static void main(String[] args) {
        Bird myBird = new Penguin("Toto");
        myBird.eat();
        myBird.sleep();

        Bird myHawkBird = new Hawk("Bibi");
        myHawkBird.eat();
        myHawkBird.sleep();


        Hawk mySuperHawk = new Hawk("Super");
        mySuperHawk.fly();

    }
}
