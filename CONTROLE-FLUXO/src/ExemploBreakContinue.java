public class ExemploBreakContinue {
    public static void main(String[] args) {
        for (int numero = 1; numero <= 5; numero++) {
            if (numero == 3) {
                break; //para a execução do laço
            //continue; continua a execução do laço
            }
            System.out.println(numero);
        }
    }
}