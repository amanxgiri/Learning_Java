package course1;

public class FindingGene {

    public static String findSimpleGene(String dna, String startCodon, String stopCodon) {

        if (dna.equals(dna.toUpperCase())) {
            startCodon = "ATG";
            stopCodon = "TAA";
        } else {
            startCodon = "atg";
            stopCodon = "taa";
        }
        int startIdx = dna.indexOf(startCodon);
        if (startIdx == -1) {
            return "";
        }
        int endIdx = dna.indexOf(stopCodon, startIdx + 3);
        if (endIdx == -1) {
            return "";
        }

        // checking valid gene sequence of not
        String res = dna.substring(startIdx, endIdx + 3);
        if (res.length() % 3 != 0) {
            return "";
        }
        return res;
    }

    public static void test() {
        String dna1 = "ATGGGTTAAGTC";
        String dna2 = "gatgctataat";

        System.out.println("DNA: " + dna2);
        System.out.println("Gene : " + findSimpleGene(dna2, "ATG", "TAA"));
    }

    public static void main(String[] args) {
        test();
    }
}