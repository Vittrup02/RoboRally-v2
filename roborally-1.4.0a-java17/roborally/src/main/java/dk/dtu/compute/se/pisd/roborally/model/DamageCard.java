package dk.dtu.compute.se.pisd.roborally.model;


public class DamageCard extends CommandCard {
    private DamageCard damageType;

    public DamageCard(Command command, DamageCard damageType) {
        super(command);
        this.damageType = damageType;
    }

    public DamageCard getDamageType() {
        return damageType;
    }
}

