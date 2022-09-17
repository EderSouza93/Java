public class ManipulacaoStringsDatas {
    public static void main(String[] args) {
        //Olá, {nome} . Hoje é {dia-da-semana, BOM DIA.

        String nome = "Eder";
        System.out.println(nome.toUpperCase());
        System.out.println(nome.toLowerCase());
        System.out.println(nome.length());

        String nomeOutro = "eder";
        System.out.println(nome.equalsIgnoreCase(nomeOutro));
    }

}
