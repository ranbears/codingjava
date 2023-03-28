package bangunruang;

public class Tabung extends Shape {

    private float R;
    private float T;
    
    public Tabung(int R,int T){
        this.R = R;
        this.T = T;
    }
    @Override
    float getVolume() {
        return (float)Math.PI*R*R*T;
    }
    
}
