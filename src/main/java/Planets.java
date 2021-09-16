public enum Planets {
    MERCURY(0.4, 0.24, 0), VENUS(0.7, 0.62, 0), EARTH(1.0, 1.00, 1), MARS(1.5, 1.88, 2), JUPITER(5.2, 11.86, 15), SATURN(9.5, 29.46, 17), URANUS(19.2, 84.07, 14), NEPTUNE(30.1, 164.82, 2);

    private double averageDistanceFromTheSun;
    private double orbitalPeriod;
    private int numberOfKnownSatellites;
    Planets(double d, double p, int n){
        averageDistanceFromTheSun = d;
        orbitalPeriod = p;
        numberOfKnownSatellites = n;
    }
    double getAverageDistanceFromTheSun(){
        return averageDistanceFromTheSun;
    }
    double getOrbitalPeriod(){
        return orbitalPeriod;
    }
    int getNumberOfKnownSatellites(){
        return numberOfKnownSatellites;
    }
}
