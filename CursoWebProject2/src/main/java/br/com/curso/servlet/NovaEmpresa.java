package br.com.curso.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.curso.servlet.modelo.Banco;
import br.com.curso.servlet.modelo.Empresa;


@WebServlet("/NovaEmpresa")
public class NovaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         
		String nome = request.getParameter("nome");
		String data = request.getParameter("data");
		
		try {
			
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date dataAbertura = sdf.parse(data);
			
			Empresa e = new Empresa(nome,dataAbertura);
			Banco banco = new Banco();
			banco.adicionaEmpresa(e);
			
			response.sendRedirect("ListaEmpresa");
			
			
		} catch (ParseException e) {
			throw new ServletException();
		}
		
	}


}
