package dk.dtu.compute.se.pisd.roborally.model;

public class DamageCardField extends CommandCardField {
    private DamageCard damageCard;

    public DamageCardField(Player player) {
        super(player);
    }

    public void setDamageCard(DamageCard card) {
        this.damageCard = card;
        this.setCard(card); // Set in the superclass for visibility
        notifyChange();
    }

    public DamageCard getDamageCard() {
        return damageCard;
    }
}
