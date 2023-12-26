import java.util.Scanner;

public class ValidadorEntrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double horaApresentacao = 18.5;
        double toleranciaAtraso = horaApresentacao + 0.5;
        double toleranciaAdiantado = horaApresentacao - 0.5;

        System.out.println("O visitante possui ingresso? Responda SIM ou NÃO.");
        String possuiIngresso = scanner.nextLine();

        boolean ehRespostaValida = possuiIngresso.matches("(?i)sim");

        if (ehRespostaValida) {
            System.out.println("Qual horário o espectador chegou?");
            String horaChegadaEntrada = scanner.nextLine();

            double horaChegada = Double.parseDouble(horaChegadaEntrada);

            if (horaChegada >= toleranciaAtraso) {
                System.out.println("Entrada não permitida. Motivo: excedeu a tolerância de atraso.");
            } else if (horaChegada <= toleranciaAdiantado) {
                System.out.println("Entrada não permitida. Motivo: A sala ainda não foi aberta.");
            } else {
                System.out.println("Pode entrar. Se dirija até a próxima sala.");
            }
        } else {
            System.out.println("É necessário ter um ingresso para entrar.");
        }

        scanner.close();
    }
}