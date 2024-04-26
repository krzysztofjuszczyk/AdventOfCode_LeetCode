package hackerrank.introduction;

public class CovariantTypes {

    //Complete the classes below
    class Flower {
        String whatsYourName(){
            return "I have many names and types.";
        }
    }

    class Jasmine extends Flower{
        @Override
        String whatsYourName(){
            return "Jasmine";
        }
    }

    class Lily extends Flower{
        @Override
        String whatsYourName(){
            return "Lily";
        }
    }

    class Region {
        Flower yourNationalFlower(){
            return new Flower();
        }
    }

    class WestBengal extends Region {
        Jasmine yourNationalFlower(){
            return new Jasmine();
        }
    }

    class AndhraPradesh extends Region{
        Lily yourNationalFlower(){
            return new Lily();
        }
    }
}
