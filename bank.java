/**
 * bank
 */
class bankAc {
    private String Acno;
    private double Bal;

    public bankAc(String Acno, double Bal) {
        this.Acno = Acno;
        this.Bal = Bal;
    }

    public String getAcno() {
        return Acno;
    }

    public void setAcno(String Acno) {
        this.Acno = Acno;
    }

    public double getBal() {
        return Bal;
    }

    public void deposit(double amount) {
        Bal += amount;
    }

    public void withdraw(double amount) {
        if (amount <= Bal) {
            Bal -= amount;
        } else {
            System.out.println("insufficient funds");
        }
    }
}

public class bank {

    public static void main(String[] args) {
        bankAc obj = new bankAc("A/C11222316004", 50000);
        System.out.println("Bank account number- " + obj.getAcno());
        System.out.println("Available balance- " + obj.getBal());
        System.out.println();
        obj.deposit(500);
        System.out.println("balance after deposite= " + obj.getBal());
        System.out.println();
        obj.withdraw(2500);
        System.out.println("balance after withdraw= " + obj.getBal());
    }
}