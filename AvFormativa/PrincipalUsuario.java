package AvFormativa;

public class PrincipalUsuario {

	public static void main(String[] args) {
		
	Usuario usuario = new Usuario(210,"LuisFernando",450,"adm","admin");
	
	System.out.println(usuario.getId());
	System.out.println(usuario.getNome());
	System.out.println(usuario.getPassword());
	System.out.println(usuario.getPermissao());
	System.out.println(usuario.getUsuario());

	}

}
