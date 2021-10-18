package moves;

import ru.ifmo.se.pokemon.*;

public class AerialAce extends PhysicalMove{
    public AerialAce() {
        super(Type.FLYING, 60, 9999999);
    }
//ИСПРАВИТЬ
//    @Override
//    protected void applySelfEffects(Pokemon p){
//
//    }

    @Override
    protected String describe() {
        return "использует Aerial Ace";
    }
}
