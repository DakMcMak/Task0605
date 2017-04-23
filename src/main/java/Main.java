import java.io.*;

public class Main {
    public static int even;
    public static int odd;

    public static void main(String[] args) throws IOException {
        BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
        String vvedenoeChislo = b1.readLine();
        int nomerCifri = vvedenoeChislo.length() - 1;
        even = 0;
        odd = 0;
        while (nomerCifri >= 0) {
            int cifra = vvedenoeChislo.charAt(nomerCifri);
            if (cifra % 2 == 0) even++;
            else odd++;
            nomerCifri--;
        }
        System.out.println("Even: " + even + " Odd: " + odd);
    }
}
