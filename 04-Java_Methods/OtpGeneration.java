import java.util.HashSet;

public class OtpGeneration {
    public static int generateotp() {
        return (int) (Math.random() * 900000) + 100000;
    }
    public static boolean areunique(int[] otps) {
        HashSet<Integer> uniqueotps = new HashSet<>();
        for (int otp : otps) {
            uniqueotps.add(otp);
        }
        return uniqueotps.size() == otps.length;
    }
    public static void main(String[] args) {
        int[] otparr = new int[10];

        // Generate 10 OTPs and store in array
        for (int i = 0; i < 10; i++) {
            otparr[i] = generateotp();
        }

        // Print generated OTPs
        System.out.print("Generated OTPs: ");
        for (int otp : otparr) {
            System.out.print(otp + " ");
        }
        System.out.println();

        // Check uniqueness
        if (areunique(otparr)) {
            System.out.println("All OTPs are unique");
        } else {
            System.out.println("Duplicate OTPs found");
        }
    }
}
