package bangunruang;

public class bola extends Shape{

    private float r;
   
     public bola(float r){
        this.r = r;
        
     }
    @Override
    float getVolume() {
       return(float)(0.75*Math.PI*r*r*r);
    }
    
}
