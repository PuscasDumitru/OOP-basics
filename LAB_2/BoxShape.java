public class BoxShape {
    public float height;
    public float width;
    public float lenght;


    public BoxShape(float h, float w, float l) {
        height = h;
        width = w;
        lenght = l;
    }


    public BoxShape() {
        height = 1;
        width = 1;
        lenght = 1;
    }


    public BoxShape(int val) {
        height = val;
        width = val;
        lenght = val;
    }


    public float Volume() {
        return this.lenght *this.width*this.height;
    }

    public float Surface() {
        return 2*(this.height*this.width) + 2*(this.height*this.lenght) + 2*(this.width*this.lenght);
    }
}