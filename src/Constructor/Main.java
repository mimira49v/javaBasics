package Constructor;

public class Main {

    public static void main(String[] args) {

        Human human = new Human("Rick",65,70);
        Human human2 = new Human("Morty",15,50);

        System.out.println(human.name);
        System.out.println(human2.name);

        human2.eat();
        human.drink();
    }
}
