package hospital;

public class SistemaCadastro {

    public static void main(String[] args) {

        
        Paciente erick = new Paciente("18522451203", "Erick Felipe", "Rua Santa Catarina, 49");
        System.out.println("O paciente " + erick.getNome() + " de CPF " + erick.getCpf() + " reside no endereço " + erick.getEndereco() + ".");

        
    }

}
