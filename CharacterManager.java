import java.util.ArrayList;

public class CharacterManager {

    private ArrayList<Character> characters;

    public CharacterManager() {
        characters = new ArrayList<>();
    }

    // =========================================================
    // BAGIAN A - IMPLEMENTASI CORE
    // =========================================================

    /**
     * Menambahkan karakter ke dalam manager.
     * Nama karakter tidak boleh duplikat.
     *
     * @param character karakter yang akan ditambahkan
     * @return true jika berhasil, false jika gagal
     */
    public boolean addCharacter(Character character) {

        if (character == null) {
            return false;
        }

        // Menolak nama duplikat
        if (findByName(character.getName()) != null) {
            return false;
        }

        characters.add(character);
        return true;
    }

    /**
     * Mencari karakter berdasarkan nama.
     *
     * @param name nama karakter yang dicari
     * @return karakter jika ditemukan, null jika tidak ditemukan
     */
    public Character findByName(String name) {

        for (Character character : characters) {

            if (character.getName().equals(name)) {
                return character;
            }
        }

        return null;
    }

    /**
     * Menghapus karakter berdasarkan nama.
     *
     * @param name nama karakter yang akan dihapus
     * @return true jika berhasil, false jika tidak ditemukan
     */
    public boolean removeCharacter(String name) {

        Character character = findByName(name);

        if (character != null) {
            characters.remove(character);
            return true;
        }

        return false;
    }

    /**
     * Mengembalikan jumlah karakter.
     *
     * @return jumlah karakter
     */
    public int getTotalCharacters() {
        return characters.size();
    }

    /**
     * Mengembalikan salinan ArrayList karakter.
     * ArrayList asli tidak diekspos.
     *
     * @return salinan ArrayList karakter
     */
    public ArrayList<Character> getAllCharacters() {
        return new ArrayList<>(characters);
    }


    // =========================================================
    // BAGIAN B - MINI CHALLENGE
    // =========================================================

    /**
     * Menghitung rata-rata level seluruh karakter.
     *
     * @return rata-rata level atau 0 jika list kosong
     */
    public double getAverageLevel() {

        // Mencegah pembagian dengan nol
        if (characters.isEmpty()) {
            return 0;
        }

        int totalLevel = 0;

        for (Character character : characters) {
            totalLevel += character.getLevel();
        }

        return (double) totalLevel / characters.size();
    }

    /**
     * Mencari semua karakter berdasarkan tipe.
     *
     * @param type tipe karakter yang dicari
     * @return ArrayList berisi semua karakter dengan tipe tersebut
     */
    public ArrayList<Character> findByType(CharacterType type) {

        ArrayList<Character> result = new ArrayList<>();

        for (Character character : characters) {

            if (character.getType() == type) {
                result.add(character);
            }
        }

        return result;
    }


    // =========================================================
    // BAGIAN C - FITUR ANALITIK RANCANGAN SENDIRI
    // =========================================================

    /**
     * Mencari karakter dengan level tertinggi.
     *
     * @return karakter dengan level tertinggi,
     *         atau null jika tidak ada karakter
     */
    public Character findStrongest() {

        if (characters.isEmpty()) {
            return null;
        }

        Character strongest = characters.get(0);

        for (Character character : characters) {

            if (character.getLevel() > strongest.getLevel()) {
                strongest = character;
            }
        }

        return strongest;
    }
}