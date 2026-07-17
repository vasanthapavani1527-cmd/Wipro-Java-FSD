abstract class Instrument {

    abstract void play();
}

class Piano extends Instrument {

    void play() {
        System.out.println("Piano is playing tan tan tan tan");
    }
}

class Flute extends Instrument {

    void play() {
        System.out.println("Flute is playing toot toot toot toot");
    }
}

class Guitar extends Instrument {

    void play() {
        System.out.println("Guitar is playing tin tin tin");
    }
}

public class C {

    public static void main(String[] args) {

        Instrument[] ins = new Instrument[10];

        for (int i = 0; i < ins.length; i++) {

            int n = (int) (Math.random() * 3);

            if (n == 0)
                ins[i] = new Piano();
            else if (n == 1)
                ins[i] = new Flute();
            else
                ins[i] = new Guitar();
        }

        for (int i = 0; i < ins.length; i++) {

            System.out.print("Index " + i + " : ");

            ins[i].play();

            if (ins[i] instanceof Piano)
                System.out.println("Object is Piano");

            else if (ins[i] instanceof Flute)
                System.out.println("Object is Flute");

            else if (ins[i] instanceof Guitar)
                System.out.println("Object is Guitar");

            System.out.println();
        }
    }
}
