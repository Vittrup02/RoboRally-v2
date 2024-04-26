package dk.dtu.compute.se.pisd.roborally.model;
import dk.dtu.compute.se.pisd.roborally.model.Player;

public enum DamageCard {
    SPAM_DAMAGE,
    VIRUS_DAMAGE,
    TROJAN_HORSE_DAMAGE,
    WORM_DAMAGE;

    public void applyDamage(Player player) {
        switch(this) {
            case SPAM_DAMAGE:
                applySpamDamage(player);
                break;
            case VIRUS_DAMAGE:
                this.applyVirusDamage(player);
                break;
            case TROJAN_HORSE_DAMAGE:
                this.applyTrojanHorseDamage(player);
                break;
            case WORM_DAMAGE:
                this.applyWormDamage(player);
                break;
            default:
                //do nothing

        }
    }
// methods not yet imlempented
    private void applyWormDamage(Player player) {

    }

    private void applyTrojanHorseDamage(Player player) {
    }

    private void applyVirusDamage(Player player) {
    }

    private void applySpamDamage(Player player) {

    }

}

