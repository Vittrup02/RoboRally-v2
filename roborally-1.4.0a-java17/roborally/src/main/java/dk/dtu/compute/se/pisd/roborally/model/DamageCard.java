package dk.dtu.compute.se.pisd.roborally.model;

public class DamageCard extends CommandCard {
    private DamageType damageType;  // Correct type from DamageCard to DamageType

    public DamageCard(Command command, DamageType damageType) {
        super(command);
        this.damageType = damageType;
    }

    public DamageType getDamageType() {
        return damageType;
    }
}
