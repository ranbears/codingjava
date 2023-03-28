package bangunruang;

public class Balok extends Shape{
    private float p;
    private float l;
    private float t;
    
     public Balok(int p, int l, int t){
        this.p = p;
        this.l = l;
        this.t = t;
    }

    @Override
    float getVolume() {
        return (float)(p*l*t);
    }
    
}
