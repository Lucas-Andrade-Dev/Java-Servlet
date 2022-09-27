package br.com.curso.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.curso.servlet.modelo.Banco;
import br.com.curso.servlet.modelo.Empresa;



@WebServlet("/ListaEmpresa")
public class ListaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	      Banco banco = new Banco();
	      
	      List<Empresa> lista = banco.getEmpresa();
	      
	      request.setAttribute("lista", lista);
	      
	      RequestDispatcher rd = request.getRequestDispatcher("/ListaEmpresa.jsp");
	      
	      rd.forward(request, response);
	      
	}

}
