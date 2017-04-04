package entity;


/**
 * Created by Joe on 3/24/2017.
 *
 * and then turn it into a json with jackson, and return it
 */
public class GeneratedCharacter {

    private CharacterClass characterClass;
    private Description description;
    private Origin origin;
    private Quirk quirk;
    private Race race;
    private Alignment alignment;

    public CharacterClass getCharacterClass() {
        return characterClass;
    }

    public void setCharacterClass(CharacterClass characterClass) {
        this.characterClass = characterClass;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }

    public Origin getOrigin() {
        return origin;
    }

    public void setOrigin(Origin origin) {
        this.origin = origin;
    }

    public Quirk getQuirk() {
        return quirk;
    }

    public void setQuirk(Quirk quirk) {
        this.quirk = quirk;
    }

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }

    public Alignment getAlignment() {
        return alignment;
    }

    public void setAlignment(Alignment alignment) {
        this.alignment = alignment;
    }
}