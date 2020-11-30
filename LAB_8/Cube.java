public class Cube implements GeometricBody
{
    int len;
    double volume, surface;

    Cube(int len)
    {
        this.len = len;
        this.surface = 6 * this.len * this.len;
        this.volume = this.len * this.len * this.len;
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
