public class Fibonacci {
    private int calculationCount;

    public int getCalculationCount() {
        return calculationCount;
    }

    public int calcNerek(int n) {
        calculationCount = 0;

        if (n <= 1)
            return n;

        int a = 0;
        int b = 1;
        int result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b;
            a = b;
            b = result;
            calculationCount += 3; // 3 aritmetické operace na každou iteraci
        }

        return result;
    }

    public int calcRek(int n) {
        calculationCount = 0;
        return calcRekPomocna(n);
    }

    private int calcRekPomocna(int n) {
        calculationCount++;

        if (n <= 1)
            return n;

        return calcRekPomocna(n - 1) + calcRekPomocna(n - 2);
    }

    public int calcRekTable(int n) {
        calculationCount = 0;

        if (n <= 1)
            return n;

        int[] tabulka = new int[n + 1];
        tabulka[0] = 0;
        tabulka[1] = 1;
        calculationCount += 2; // 2 přiřazení

        for (int i = 2; i <= n; i++) {
            tabulka[i] = tabulka[i - 1] + tabulka[i - 2];
            calculationCount += 3; // 3 aritmetické operace na každou iteraci
        }

        return tabulka[n];
    }

    public void initVypocetSlozitosti() {
        calculationCount = 0;
    }

    public static void main(String[] args) {
        Fibonacci fibonacci = new Fibonacci();

        int n1 = 10;
        int n2 = 5;

        System.out.println("Výpočet " + n1 + ". členu Fibonacciho posloupnosti:");
        int n1Vysledek = fibonacci.calcRekTable(n1);
        System.out.println("Výsledek: " + n1Vysledek);
        System.out.println("Počet výpočtů: " + fibonacci.getCalculationCount());

        System.out.println("\nVýpočet " + n2 + ". členu Fibonacciho posloupnosti:");
        int n2Vysledek = fibonacci.calcRekTable(n2);
        System.out.println("Výsledek: " + n2Vysledek);
        System.out.println("Počet výpočtů: " + fibonacci.getCalculationCount());
    }
}
