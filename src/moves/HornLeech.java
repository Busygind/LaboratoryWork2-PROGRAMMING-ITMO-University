package moves;

import ru.ifmo.se.pokemon.*;

import static java.lang.Math.abs;

public class HornLeech extends PhysicalMove {
    public HornLeech(){
        super(Type.GRASS, 75, 100);
    }
//ИСПРАВИТЬ
//    @Override
//    protected void applySelfEffect(Pokemon p){
//        int diffHP = (int) abs(p.getHP() - Stat.HP);
//        Stat qwe = Stat.HP;
//    }
    @Override
    protected String describe() {
        return "использует Horn Leech";
    }
}
