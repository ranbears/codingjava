package bangunruang;

public class Run {
    
     public static void main(String[] args) {
         
         Shape Kubus = new Kubus(5);
         Shape Balok = new Balok(2,3,6);
         Shape Tabung = new Tabung(7,5);
         Shape Kerucut = new Kerucut(6,2);
         Shape Limas = new Limas(12,4);
         Shape prisma = new prisma(6,4,9);
         Shape bola = new bola(4);
         
         System.out.println("Jadi Volumenya adalah");
         System.out.println("Volume Kubus   : "+ Kubus.getVolume());
         System.out.println("Volume Balok   : "+ Balok.getVolume());
         System.out.println("Volume Tabung  : "+ Tabung.getVolume());
         System.out.println("Volume Kerucut : "+ Kerucut.getVolume());
         System.out.println("Volume Limas   : "+ Limas.getVolume());
         System.out.println("Volume prisma  : "+ prisma.getVolume());
         System.out.println("Volume Bola    : "+ bola.getVolume());
             
     }

}
