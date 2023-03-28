package bangunruang;

public class prisma extends Shape{

    private float a;
    private float t;
    private float tp;
    
    public prisma(int a,int t,int tp){
        this.a = a;
        this.t = t;
        this.tp = tp;
    }
    @Override
    float getVolume() {
        return (float)(0.5*a*t)*tp;
    }
    
}
