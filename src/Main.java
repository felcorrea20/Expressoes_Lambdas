public class Main {
    public static void main(String[] args) {

        Conta c = (a, b) -> a * b;
        System.out.println("Multiplicacao: " + c.conta(5,3));

        NumeroPrimo n = (a) -> {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) return false;
            }
            return (a > 1);
        };

        System.out.println("Numero primo.: " + n.verificaNumeroPrimo(2));

        Conversao conv = (s) -> s.toUpperCase();
        System.out.println(conv.conversaoParaMaiuscula("felipe"));

        Palindromo p = (str) -> {
            StringBuilder strInvertido = new StringBuilder(str);
            return (str.equalsIgnoreCase(String.valueOf(strInvertido.reverse())));
        };
        System.out.println("Palindromo: " + p.verificarPalindromo("felipe"));

    }
}
