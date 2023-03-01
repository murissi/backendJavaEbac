public class Main {
    public static void main(String[] args) {

        Integer codigo;
        Long codigoMaior;
        Double valorDecimal;
        Boolean status;
        Float valorDecim;
        Short shor;
        Byte bi;
        Character letra;
        String nome;

        // Diferenca entre primitivos e Wrappers são os metodos que tem.

        // Boxing(autoboxing) e unboxing
        // conversao dos tipos primitivos para wrappers

        Boolean a = true; // boxing = autoboxing. valor primitivo numa variavel Wrapper.
        Boolean status1 = Boolean.TRUE; // Declarando uma valor wrapper numa variavel wrapper.

        Character c = 'A'; // autoboxing;
        Integer idade = 10; // autoboxing
        Long cpf = Long.valueOf(1324124124L); // NÃO BOXING


        // Unboxing

        boolean status2 = Boolean.TRUE; // unboxing

    }
}