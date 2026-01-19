public class VolumeOfEarth {
    public static void main(String[] args) {
        double radiusKm = 6378;
        double pi = Math.PI;

        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert km³ to miles³
        double volumeMiles = volumeKm / Math.pow(1.6, 3);

        System.out.println(
            "The volume of earth in cubic kilometers is " + volumeKm +
            " and cubic miles is " + volumeMiles
        );
    }
}
