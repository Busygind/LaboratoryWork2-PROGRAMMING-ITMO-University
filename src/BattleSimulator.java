import pokemons.*;
import ru.ifmo.se.pokemon.*;

public class BattleSimulator {

    public static void main(String[] args) {
        Battle b = new Battle();
        Raichu p1 = new Raichu("", 1);
        Pikachu p2 = new Pikachu("", 1);
        Arbok p3 = new Arbok("", 1);
        Breloom p4 = new Breloom("", 1);
        Regirock p5 = new Regirock("", 1);
        Regice p6 = new Regice("", 1);
        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}