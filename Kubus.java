package bangunruang;

public class Kubus extends Shape{

    private float s;
    
    public Kubus(float s){
        this.s = s;
    }

    @Override
    float getVolume() {
        return(float)(s*s*s);
    }
    
}