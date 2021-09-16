import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the Planet");
        String nameOfThePlanet = scanner.nextLine();
        Planets planet;
        try{
            System.out.println("Average distance from the Sun is " + Planets.valueOf(nameOfThePlanet).getAverageDistanceFromTheSun()+" a.u.");
            System.out.println("Orbital period is " + Planets.valueOf(nameOfThePlanet).getOrbitalPeriod()+" years");
            System.out.println("Number of known satellites is " + Planets.valueOf(nameOfThePlanet).getNumberOfKnownSatellites());
        } catch (IllegalArgumentException ex)
        {
            System.out.println("Sorry, it is unknown planet");
        }

    }
}
