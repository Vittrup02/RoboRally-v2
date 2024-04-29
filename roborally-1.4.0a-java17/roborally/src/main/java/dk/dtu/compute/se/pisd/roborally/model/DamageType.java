package dk.dtu.compute.se.pisd.roborally.model;

public enum DamageType {
    SPAM("Spam", "Simplest form of damage. Affects robot operations minimally."),
    WORM("Worm", "Forces a robot to reboot, clearing temporary states."),
    TROJAN_HORSE("Trojan Horse", "Forces a robot to take two additional SPAM damage cards."),

    VIRUS("Virus","Spreads damage to nearby robots within a six-space radius.");
    final public String displayName;
    final public String description;

    // Constructor for the enum values
    DamageType(String displayName, String description) {
        this.displayName = displayName;
        this.description = description;
    }

    /**
     * Gets the display name of the damage type.
     *
     * @return the display name
     */
    public String getDisplayName() {
        return displayName;
    }

    /**
     * Gets a description of the damage type.
     *
     * @return the description
     */
    public String getDescription() {
        return description;
    }
}
