// The file name must follow the name of the "father" class in the file
// It`s a convention to write the name of a class starts with a capital letter

public class Main {
    public static void main(String[] args) {
        // Representation of a Bicycle class
        // Bicycle its know as a superclass
        class Bicycle {
            int cadence = 0;
            int speed = 0;
            int gear = 1;

            void changeCadence(int newValue) {
                cadence = newValue;
            }

            void speedUp(int increment) {
                speed += increment;
            }

            void applyBreaks(int decrement) {
                speed -= decrement;
            }

            void changeGear(int newValue) {
                gear = newValue;
            }

            void getStates() {
                System.out.println("cadence:" +
                        cadence + " speed:" +
                        speed + " gear:" + gear);
            }
        }

        //We can extend the Bicycle class to create a subclass
        class MountainBike extends Bicycle {
            String wheels = "mountain wheels";

            void getStates() {
                System.out.println("cadence:" +
                        cadence + " speed:" +
                        speed + " gear:" + gear + " wheels:" + wheels);
            }
        }


        // Two different bicycle objects
        Bicycle bike1 = new Bicycle();
        Bicycle bike2 = new Bicycle();
        MountainBike mountain1 = new MountainBike();

        bike1.changeCadence(50);
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.getStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.getStates();

        mountain1.changeCadence(250);
        mountain1.speedUp(5);
        mountain1.changeGear(1);
        mountain1.getStates();

    }
}