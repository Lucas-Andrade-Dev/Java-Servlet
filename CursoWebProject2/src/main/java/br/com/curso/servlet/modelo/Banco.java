package br.com.curso.servlet.modelo;

import java.util.ArrayList;

import java.util.List;

public class Banco extends Empresa {

	private static List<Empresa> lista = new ArrayList<>();
	private static List<Login> login = new ArrayList<>();

	static {
		Login user = new Login("adm", "123");
		login.add(user);
	}

	public Login buscaUsuario(String user, String senha) {
		for (Login e : Banco.login) {
			if (e.getNome().equals(user) && e.getSenha().equals(senha)) {
				return e;
			}
		}
		return null;
	}

	public void adicionaEmpresa(Empresa e) {
		lista.add(e);
	}

	public List<Empresa> getEmpresa() {
		return Banco.lista;
	}

	public void apagarEmpresa(Integer id) {

		lista.removeIf(e -> (e.getId() == id));

	}

}
