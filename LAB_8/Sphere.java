public class Sphere implements GeometricBody
{
    int radius;
    double surface, volume;

    Sphere(int radius)
    {
        this.radius = radius;
        this.surface = 4 * Math.PI * this.radius * this.radius;
        this.volume = (4 * Math.PI * this.radius * this.radius * this.radius) / 3;
    }

    public double getSurface()
    {
        return surface;
    }

    public double getVolume()
    {
        return volume;
    }

}
