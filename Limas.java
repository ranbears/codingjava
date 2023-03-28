package bangunruang;

public class Limas extends Shape{

    private float la;
    private float t;
    
    public Limas(int la,int t){
        this.la = la;
        this.t = t;
    }
    @Override
    float getVolume() {
        return (float)0.3*la*t;
    }
    
}
