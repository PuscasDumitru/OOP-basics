import java.util.ArrayList;

public class GeometricBodyController
{
    private ArrayList<GeometricBody> bodies;


    GeometricBodyController(ArrayList<GeometricBody> bodies)
    {
        this.bodies = bodies;
    }

    public double getMaxSurface()
    {
        double maxSurface = this.bodies.get(0).getSurface();
        int id = 0;

        for (int i = 0; i < this.bodies.size(); i++)
        {
            if (maxSurface < this.bodies.get(i).getSurface())
            {
                maxSurface = this.bodies.get(i).getSurface();
                id = i;
            }
        }


        System.out.println("The body with the biggest surface is a : " + this.bodies.get(id).getClass().getSimpleName());


        return maxSurface;
    }


    public double getMaxVolume()
    {
        double maxVolume = this.bodies.get(0).getVolume();
        int id = 0;
        for (int i = 0; i < this.bodies.size(); i++)
        {
            if (maxVolume < this.bodies.get(i).getVolume())
            {
                maxVolume = this.bodies.get(i).getVolume();
                id = i;
            }
        }


        System.out.println("The body with the biggest volume is a : " + this.bodies.get(id).getClass().getSimpleName());

        return maxVolume;
    }
}
