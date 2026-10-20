import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        CharacterManager manager = new CharacterManager();

        System.out.println("==============================================");
        System.out.println("       CHARACTER MANAGER - TP5");
        System.out.println("       AP6 BELAJAR PRAKTIK");
        System.out.println("==============================================");


        // =====================================================
        // BAGIAN A - IMPLEMENTASI CORE
        // =====================================================

        System.out.println("\n========== BAGIAN A ==========");


        // -----------------------------------------------------
        // ADD CHARACTER
        // -----------------------------------------------------

        System.out.println("\n--- Add Character ---");

        Character aria =
                new Character(
                        "Aria",
                        5,
                        CharacterType.MAGE
                );

        Character bima =
                new Character(
                        "Bima",
                        8,
                        CharacterType.WARRIOR
                );

        Character citra =
                new Character(
                        "Citra",
                        10,
                        CharacterType.MAGE
                );

        Character doni =
                new Character(
                        "Doni",
                        7,
                        CharacterType.ARCHER
                );

        System.out.println(
                "Tambah Aria  : "
                + manager.addCharacter(aria)
        );

        System.out.println(
                "Tambah Bima  : "
                + manager.addCharacter(bima)
        );

        System.out.println(
                "Tambah Citra : "
                + manager.addCharacter(citra)
        );

        System.out.println(
                "Tambah Doni  : "
                + manager.addCharacter(doni)
        );


        // -----------------------------------------------------
        // DUPLICATE NAME
        // -----------------------------------------------------

        System.out.println("\n--- Duplicate Name Test ---");

        Character duplicateAria =
                new Character(
                        "Aria",
                        20,
                        CharacterType.WARRIOR
                );

        boolean duplicateResult =
                manager.addCharacter(duplicateAria);

        System.out.println(
                "Tambah Aria lagi : "
                + duplicateResult
        );

        System.out.println(
                "Total Character  : "
                + manager.getTotalCharacters()
        );


        // -----------------------------------------------------
        // FIND BY NAME
        // -----------------------------------------------------

        System.out.println("\n--- Find By Name ---");

        Character found =
                manager.findByName("Bima");

        if (found != null) {

            System.out.println(
                    "Karakter ditemukan : "
                    + found
            );

        } else {

            System.out.println(
                    "Karakter tidak ditemukan."
            );
        }


        // -----------------------------------------------------
        // GET ALL CHARACTERS
        // -----------------------------------------------------

        System.out.println("\n--- Get All Characters ---");

        ArrayList<Character> allCharacters =
                manager.getAllCharacters();

        for (Character character : allCharacters) {
            System.out.println(character);
        }


        // -----------------------------------------------------
        // TOTAL CHARACTER
        // -----------------------------------------------------

        System.out.println("\n--- Total Characters ---");

        System.out.println(
                "Jumlah karakter : "
                + manager.getTotalCharacters()
        );


        // -----------------------------------------------------
        // COPY EXPERIMENT
        // -----------------------------------------------------

        System.out.println(
                "\n--- getAllCharacters() Copy Test ---"
        );

        ArrayList<Character> copy =
                manager.getAllCharacters();

        System.out.println(
                "Jumlah data sebelum copy.clear() : "
                + copy.size()
        );

        copy.clear();

        System.out.println(
                "Jumlah data pada copy setelah clear : "
                + copy.size()
        );

        System.out.println(
                "Jumlah data pada manager           : "
                + manager.getTotalCharacters()
        );

        System.out.println(
                "Data manager tetap ada : "
                + manager.getAllCharacters()
        );


        // -----------------------------------------------------
        // REMOVE CHARACTER
        // -----------------------------------------------------

        System.out.println("\n--- Remove Character ---");

        boolean removed =
                manager.removeCharacter("Bima");

        System.out.println(
                "Bima berhasil dihapus : "
                + removed
        );

        System.out.println(
                "Total Character setelah remove : "
                + manager.getTotalCharacters()
        );


        // =====================================================
        // BAGIAN B - MINI CHALLENGE
        // =====================================================

        System.out.println("\n========== BAGIAN B ==========");


        // -----------------------------------------------------
        // AVERAGE LEVEL
        // -----------------------------------------------------

        System.out.println("\n--- Average Level ---");

        System.out.println(
                "Rata-rata level : "
                + manager.getAverageLevel()
        );


        // -----------------------------------------------------
        // FIND BY TYPE - MAGE
        // -----------------------------------------------------

        System.out.println("\n--- Find By Type: MAGE ---");

        ArrayList<Character> mages =
                manager.findByType(CharacterType.MAGE);

        for (Character character : mages) {
            System.out.println(character);
        }


        // -----------------------------------------------------
        // FIND BY TYPE - WARRIOR
        // -----------------------------------------------------

        System.out.println("\n--- Find By Type: WARRIOR ---");

        ArrayList<Character> warriors =
                manager.findByType(CharacterType.WARRIOR);

        for (Character character : warriors) {
            System.out.println(character);
        }


        // -----------------------------------------------------
        // FIND BY TYPE - ARCHER
        // -----------------------------------------------------

        System.out.println("\n--- Find By Type: ARCHER ---");

        ArrayList<Character> archers =
                manager.findByType(CharacterType.ARCHER);

        for (Character character : archers) {
            System.out.println(character);
        }


        // -----------------------------------------------------
        // EMPTY LIST AVERAGE
        // -----------------------------------------------------

        System.out.println(
                "\n--- Empty List Average Test ---"
        );

        CharacterManager emptyManager =
                new CharacterManager();

        System.out.println(
                "Average Level (kosong) : "
                + emptyManager.getAverageLevel()
        );


        // =====================================================
        // BAGIAN C - FITUR ANALITIK
        // =====================================================

        System.out.println("\n========== BAGIAN C ==========");


        System.out.println("\n--- Find Strongest ---");

        Character strongest =
                manager.findStrongest();

        if (strongest != null) {

            System.out.println(
                    "Karakter terkuat : "
                    + strongest
            );

        } else {

            System.out.println(
                    "Belum ada karakter."
            );
        }


        // =====================================================
        // BAGIAN D - REFERENCE EXPERIMENT
        // =====================================================

        System.out.println(
                "\n========== BAGIAN D =========="
        );

        System.out.println(
                "\n--- Reference Experiment ---"
        );

        Character a =
                new Character(
                        "ReferenceTest",
                        5,
                        CharacterType.WARRIOR
                );

        Character b = a;

        b.setLevel(8);

        System.out.println(
                "a.getLevel() : "
                + a.getLevel()
        );

        System.out.println(
                "a == b       : "
                + (a == b)
        );

        System.out.println(
                "Keterangan   : a dan b menunjuk object yang sama."
        );


        // -----------------------------------------------------
        // INDEPENDENT OBJECT TEST
        // -----------------------------------------------------

        System.out.println(
                "\n--- Independent Object Test ---"
        );

        Character independent =
                new Character(
                        a.getName(),
                        a.getLevel(),
                        a.getType()
                );

        independent.setLevel(15);

        System.out.println(
                "Level a              : "
                + a.getLevel()
        );

        System.out.println(
                "Level independent    : "
                + independent.getLevel()
        );

        System.out.println(
                "a == independent     : "
                + (a == independent)
        );


        // =====================================================
        // SELESAI
        // =====================================================

        System.out.println(
                "\n=============================================="
        );

        System.out.println(
                "          SEMUA PENGUJIAN SELESAI"
        );

        System.out.println(
                "=============================================="
        );
    }
}