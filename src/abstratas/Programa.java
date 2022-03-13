package abstratas;

public class Programa {

    public static void main(String Args[]) {

     PessoaFisica pessoa = new PessoaFisica();
     pessoa.setNome("Pedro");
     pessoa.setSobrenome("Farias");
     pessoa.setEnderecoresidencial("Rua Piracicaba");
     System.out.println(pessoa.getNome() + " endereço residencial é: " + pessoa.getEnderecoresidencial());

    }
}
