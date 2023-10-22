public class Main {

    public static void main(String[] args) {

        String nome = Colors.GREEN.getANSI() + "Guilherme";
        String idade = Colors.GREEN.getANSI() + "15 Anos";
        String trabalho = Colors.YELLOW.getANSI() + "Programador";

        //Realizar os prints.
        System.out.println(Colors.AQUA.getANSI() + "Nome: " + nome);
        System.out.println(Colors.GOLDEN.getANSI() + "Idade: " + idade);
        System.out.println(Colors.RED.getANSI() + "Trabalho: " + trabalho);
        System.out.println(Colors.RGBANSIColor("200", "150", "15") + "Espero que tenham gostado!");
    }
}