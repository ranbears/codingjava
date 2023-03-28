package polimorfisme;
public class run {
    
    public static void main(String[]args){
        piano objpiano = new piano();
        biola objbiola = new biola();
        gitar objgitar = new gitar();
        drum objdrum = new drum();
        saxophone objsaxophone = new saxophone();
        trompet objtrompet = new trompet();
        
        piano[]piano = new piano[6];
        piano[0] = objpiano;
        piano[1] = objbiola;
        piano[2] = objgitar;
        piano[3] = objdrum;
        piano[4] = objsaxophone;
        piano[5] = objtrompet;
        
        System.out.println("1.Alat musik [piano]    : " + piano[0].respons() + piano[0].harga());
        System.out.println("2.Alat musik [biola]    : " + piano[1].respons() + piano[1].harga());
        System.out.println("3.Alat musik [gitar]    : " + piano[2].respons() + piano[2].harga());
        System.out.println("4.Alat musik [drum]     : " + piano[3].respons() + piano[3].harga());
        System.out.println("5.Alat musik [saxophone]: " + piano[4].respons() + piano[4].harga());
        System.out.println("6.Alat musik [trompet]  : " + piano[5].respons() + piano[5].harga());
    }
}
 