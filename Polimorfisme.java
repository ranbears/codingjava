package polimorfisme;
import java.*;
import java.io.*;

class piano {
    public String respons(){
        return("Dimainkan dengan cara ditekan\n\t\t\t");
    }
    public String harga(){
        return("Harganya Rp 14.400.000");
    }
}
class biola extends piano{
    public String respons(){
        return("Dimainkan dengan cara digesek\n\t\t\t");
    }
    public String harga(){
        return("Harganya Rp Rp 1.100.000");
    }
}
class gitar extends piano{
    public String respons(){
        return("Dimainkan dengan cara dipetik\n\t\t\t");
    }
    public String harga(){
        return("Harganya Rp 650.000");
    }
}
class drum extends piano{
    public String respons(){
        return("Dimainkan dengan cara dipukul\n\t\t\t");
    }
    public String harga(){
        return("Harganya Rp13.490.000");
    }
}
class saxophone extends piano{
    public String respons(){
        return("Dimainkan dengan cara ditiup\n\t\t\t");
    }
    public String harga(){
        return("Harganya Rp 10.415.000");
    }
}    
class trompet extends piano{
    public String respons(){
        return("Dimainkan dengan cara ditiup\n\t\t\t");
    }
    public String harga(){
        return("Harganya Rp1.650.000");
    }
}
