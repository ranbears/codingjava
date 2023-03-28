package bangunruang;

public class Kerucut extends Shape{

    private float R;
    private float T;
    
    public Kerucut(int R,int T){
        this.R = R;
        this.T = T;
    }

    @Override
    float getVolume() {
         return (float)0.3*R*R*T;
    }
    
}
