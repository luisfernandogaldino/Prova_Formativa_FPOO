package AvFormativa;

public class PrincipalFisica {

	public static void main(String[] args) {
		Fisica pessoaFisica = new Fisica("Luís Fernando","45645145801","390803376");

		System.out.println("\n Nome:"+pessoaFisica.getNome());
		System.out.println("\n CPF:"+pessoaFisica.getCpf());
		System.out.println("\n RG:"+pessoaFisica.getRg());

	}

}
