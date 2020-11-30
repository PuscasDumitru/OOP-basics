import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Cube cube = new Cube(32);
        Parallelepiped parallelepiped = new Parallelepiped(5, 9, 13);
        Sphere sphere = new Sphere(11);


        ArrayList<GeometricBody> bodies = new ArrayList<GeometricBody>();
        bodies.add(cube);
        bodies.add(parallelepiped);
        bodies.add(sphere);

        GeometricBodyController figuresController = new GeometricBodyController(bodies);

        System.out.println("Cube surface: " + cube.getSurface() + " Cube volume: " + cube.getVolume());
        System.out.println("Sphere surface: " + sphere.getSurface() + " Sphere volume: " + sphere.getVolume());
        System.out.println("Parallelepiped surface: " + parallelepiped.getSurface() + " Parallelepiped volume: " + parallelepiped.getVolume() + "\n");


        System.out.println("Max Surface Value: " + figuresController.getMaxSurface());
        System.out.println("Max Volume Value: " + figuresController.getMaxVolume());
    }
}
