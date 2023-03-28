package inheritance;
public class ojt extends Employee{
    
    int nip=908;
    String name="sese";
    String status="Sudah menikah";
    String jobdesk="Ojt";
    int timehours=6;
    double bonus;
    double potongan;
    
    void cetak(){
        System.out.println("NIP        = "+nip);
        System.out.println("Nama       = "+name);
        System.out.println("Status     = "+status);
        System.out.println("Jobdesk    = "+jobdesk);
        System.out.println("Time Hours = "+timehours);
        System.out.println("Gaji Awal  = "+Salary);
        run();
        oke();
        System.out.println("Bonus      = "+bonus);
        System.out.println("Potongan   = "+potongan);
        System.out.println("Total Gaji = "+Salary);
    }
    
    void run(){
        if (status.equalsIgnoreCase("sudah menikah")){
            bonus+=1000000;
    } else {
            bonus+=0;
        }
    
        if (timehours<8) {
            int a = 8 - timehours;
            a *= 50000;
            potongan += a;
        } else {
            potongan += 0;
        }
    }
    
    void oke(){
        Salary+=bonus;
        Salary-=potongan;
    }
    
}

