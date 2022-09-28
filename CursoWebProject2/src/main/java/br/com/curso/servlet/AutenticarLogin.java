package br.com.curso.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.curso.servlet.modelo.Banco;
import br.com.curso.servlet.modelo.Login;


@WebServlet("/AutenticarLogin")
public class AutenticarLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String usuario = request.getParameter("usuario");
		String senha = request.getParameter("senha");
		
		Login login = new Login();
		Banco banco = new Banco();
		
		if(usuario != null && senha != null) {
		
			if(banco.buscaUsuario(usuario, senha) != null) {
			
			login = banco.buscaUsuario(usuario, senha);
			
			request.setAttribute("usuario", login);
			
			RequestDispatcher rd = request.getRequestDispatcher("/CadastraEmpresa.jsp");
			rd.forward(request, response);
			
		}else {
			
			response.sendRedirect("/CursoWebProject2/index.jsp");
			
		}
			
		}
		
		
	}

}
