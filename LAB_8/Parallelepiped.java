public class Parallelepiped implements GeometricBody
{
    int l, w, h;
    double surface, volume;

    Parallelepiped(int l, int w, int h)
    {
        this.l = l;
        this.w = w;
        this.h = h;
        this.surface = 2 * l * w + 2 * h * w + 2 * l * h;
        this.volume = l * w * h;
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
