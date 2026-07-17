abstract class GeneralBank {

    abstract double getSavingsInterestRate();

    abstract double getFixedDepositInterestRate();
}

class ICICIBank extends GeneralBank {

    double getSavingsInterestRate() {
        return 4.0;
    }

    double getFixedDepositInterestRate() {
        return 8.5;
    }
}

class KotMBank extends GeneralBank {

    double getSavingsInterestRate() {
        return 6.0;
    }

    double getFixedDepositInterestRate() {
        return 9.0;
    }
}

public class A {

    public static void main(String[] args) {

        ICICIBank i = new ICICIBank();
        System.out.println("ICICI Bank");
        System.out.println("Savings Interest : " + i.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest : " + i.getFixedDepositInterestRate() + "%");

        System.out.println();

        KotMBank k = new KotMBank();
        System.out.println("Kotak Bank");
        System.out.println("Savings Interest : " + k.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest : " + k.getFixedDepositInterestRate() + "%");

        System.out.println();

        GeneralBank g = new KotMBank();
        System.out.println("GeneralBank -> KotMBank");
        System.out.println("Savings Interest : " + g.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest : " + g.getFixedDepositInterestRate() + "%");

        System.out.println();

        g = new ICICIBank();
        System.out.println("GeneralBank -> ICICIBank");
        System.out.println("Savings Interest : " + g.getSavingsInterestRate() + "%");
        System.out.println("Fixed Deposit Interest : " + g.getFixedDepositInterestRate() + "%");
    }
}