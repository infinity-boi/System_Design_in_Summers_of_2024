package PracticeQuestions.State;

//2. State Pattern (Photoshop Tool)
//In the Exercises project, look at the code in the state/DirectionService class. This is the class that powers our mapping app. It provides two methods for calculating the estimated time of arrival (ETA) and the direction between two points. Identify the problems in this implementation. Then, refactor the code to use the state pattern. What are the benefits of the new implementation?


public class Main {
        public static void main(String[] args) {
            DirectionService directionService = new DirectionService();

            directionService.setTravelMode(new DrivingMode());
            directionService.getEta();
            directionService.getDirection();

            directionService.setTravelMode(new BicyclingMode());
            directionService.getEta();
            directionService.getDirection();

            directionService.setTravelMode(new TransitMode());
            directionService.getEta();
            directionService.getDirection();

            directionService.setTravelMode(new WalkingMode());
            directionService.getEta();
            directionService.getDirection();
        }
}

