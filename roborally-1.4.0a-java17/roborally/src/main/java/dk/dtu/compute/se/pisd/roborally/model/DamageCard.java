package dk.dtu.compute.se.pisd.roborally.model;
/**
 * Enum for representing different types of damage cards.
 *@author Aisha Farah Mohamud s235123
 */
public enum DamageCard {
    SPAM_DAMAGE,
    VIRUS_DAMAGE,
    TROJAN_HORSE_DAMAGE,
    WORM_DAMAGE;

    /**
     * Applies the damage effect of the card to the given player.
     * @param player The player to apply the damage effect to.
     */
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
// methods not implemented 
    private void applyWormDamage(Player player) {

    }

    private void applyTrojanHorseDamage(Player player) {
    }

    private void applyVirusDamage(Player player) {
    }

    private void applySpamDamage(Player player) {

    }

}

