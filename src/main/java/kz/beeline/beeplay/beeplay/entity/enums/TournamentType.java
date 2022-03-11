
package kz.beeline.beeplay.beeplay.entity.enums;


public enum TournamentType {
    SOLO("SOLO"),
    DUO("DUO"),
    SQUAD("SQUAD");

    private String type;


    TournamentType(String solo) {
        this.type=solo;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
