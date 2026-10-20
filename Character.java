import java.util.Objects;

public class Character {

    private String name;
    private int level;
    private CharacterType type;

    // =========================================================
    // BAGIAN D - STATIC COUNTER
    // =========================================================

    private static int totalCharacterCreated = 0;

    public Character(String name, int level, CharacterType type) {
        this.name = name;
        this.level = level;
        this.type = type;

        totalCharacterCreated++;
    }

    // Getter dan Setter Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter dan Setter Level
    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    // Getter dan Setter Type
    public CharacterType getType() {
        return type;
    }

    public void setType(CharacterType type) {
        this.type = type;
    }

    // =========================================================
    // BAGIAN D - GET TOTAL CHARACTER CREATED
    // =========================================================

    public static int getTotalCharacterCreated() {
        return totalCharacterCreated;
    }

    // =========================================================
    // BAGIAN A - EQUALS
    // =========================================================

    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Character)) {
            return false;
        }

        Character other = (Character) obj;

        // Character dianggap sama berdasarkan nama
        return Objects.equals(this.name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return "Character{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", type=" + type +
                '}';
    }
}