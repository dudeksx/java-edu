package FluxControl;

public class TernaryCondition {
    public static void main(String[] args) {
        int note = 8;
        String result = note >= 7 ? "Approved" : note >= 5 && note < 7 ? "Recovery" : "Failed";
        System.out.println(result);
    }
}
