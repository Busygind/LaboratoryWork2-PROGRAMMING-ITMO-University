package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove{
    public AerialAce() {
        super(Type.FLYING, 60, 9999999);
    }
//ИСПРАВИТЬ
//    @Override
//    protected void applyOppEffects(Pokemon p){
//        if (Math.random()<0.1) {
//            Effect.freeze(p);
//        }
//    }

    @Override
    protected String describe() {
        return "использует Aerial Ace";
    }
}
