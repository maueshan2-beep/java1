public class tap4 {

    // ================= RETURN ТАПСЫРМАЛАРЫ =================

    // Тапсырма 1: Санның квадратын қайтаратын әдіс
    public static int square(int number) {
        return number * number;
    }

    // Тапсырма 2: Санның жай сан екенін тексеру
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        // ================= BREAK =================
        System.out.println("=== BREAK ===");

        // Тапсырма 1
        System.out.println("1-ден 100-ге дейін (13-ке бөлінгенде тоқтайды):");
        for (int i = 1; i <= 100; i++) {
            if (i % 13 == 0) {
                break; // 13-ке бөлінсе тоқтайды
            }
            System.out.print(i + " ");
        }

        // Тапсырма 2
        System.out.println("\n\n1-200 аралығында 7 және 9-ға бөлінетін бірінші сан:");
        for (int i = 1; i <= 200; i++) {
            if (i % 7 == 0 && i % 9 == 0) {
                System.out.println(i);
                break;
            }
        }


        // ================= CONTINUE =================
        System.out.println("\n=== CONTINUE ===");

        // Тапсырма 1
        System.out.println("1-50 (4-ке бөлінетіндерді өткізіп жіберу):");
        for (int i = 1; i <= 50; i++) {
            if (i % 4 == 0) {
                continue; // 4-ке бөлінсе өткізіп жібереді
            }
            System.out.print(i + " ");
        }

        // Тапсырма 2
        System.out.println("\n\n1-100 (ішінде 7 цифры бар сандар жоқ):");
        for (int i = 1; i <= 100; i++) {
            if (String.valueOf(i).contains("7")) {
                continue; // ішінде 7 болса өткізіп жіберу
            }
            System.out.print(i + " ");
        }


        // ================= RETURN =================
        System.out.println("\n\n=== RETURN ===");

        int num = 5;
        System.out.println("5 санының квадраты: " + square(num));

        int testNumber = 17;
        System.out.println("17 жай сан ба? " + isPrime(testNumber));
    }
}