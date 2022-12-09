package world.ntdi.ralow;

import java.util.Random;

public final class Ralow {
    public String american(int age) {
        return (age > 10 ? "True blooded" : "not american");
    }

    public int age() {
        Random r = new Random();
        return r.nextInt(25);
    }
}
