package br.com.curso.servlet;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.curso.servlet.modelo.Banco;
import br.com.curso.servlet.modelo.Empresa;

@WebServlet("/EmpresaControler")
public class EmpresaControler extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String acao = request.getParameter("acao");
		String search = request.getParameter("search");
		//Integer id = Integer.parseInt(request.getParameter("id"));
		Integer id;
		String bnome;
		String nome = request.getParameter("nome");
		String data = request.getParameter("data");
		
		System.out.println(search);
		
		if(isInteger(search) == true) {
			id = Integer.parseInt(search);
			bnome = null;
		}else {
			bnome = search;
			id = null;
		}
		
		Banco banco = new Banco();
		List<Empresa> lista = banco.getEmpresa();

		if (acao != null && acao.equals("excluir")) {

			banco.apagarEmpresa(id);
			
			response.sendRedirect("ListaEmpresa");
			

		} else if (acao != null && acao.equals("editar")) {

			try {

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date dataAbertura = sdf.parse(data);
				lista.forEach(e -> {
					if (e.getId() == id) {
						e.setNome(nome);
						e.setData(dataAbertura);
					}

				});
				
				response.sendRedirect("ListaEmpresa");

			} catch (ParseException e) {
				throw new ServletException();
			}

		}else if(acao != null && acao.equals("buscar")) {
			
			
		if(id != null) {	
			
			lista.forEach(e->{
				
				boolean buscar = false;
				if(buscar = e.getId() == id) {
					request.setAttribute("id", e.getId());
					request.setAttribute("nome", e.getNome());
					request.setAttribute("data", e.getData());
					request.setAttribute("tem", buscar);
				}
			});
			
		
		}else if(bnome != null) {
			
	        lista.forEach(e->{
				
				boolean buscar = false;
				if(buscar = e.getNome().equals(bnome)) {
					request.setAttribute("id", e.getId());
					request.setAttribute("nome", e.getNome());
					request.setAttribute("data", e.getData());
					request.setAttribute("tem", buscar);
				}
			});
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("Buscar.jsp");
		rd.forward(request, response);
		
		
		}else if (acao != null && acao.equals("excluirPbusca")) {

			banco.apagarEmpresa(id);
			
			response.sendRedirect("/CursoWebProject2/Buscar.jsp");
			

		} else if (acao != null && acao.equals("editarPbusca")) {

			try {

				SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
				Date dataAbertura = sdf.parse(data);
				lista.forEach(e -> {
					if (e.getId() == id) {
						e.setNome(nome);
						e.setData(dataAbertura);
					}

				});
				
				response.sendRedirect("/CursoWebProject2/Buscar.jsp");

			} catch (ParseException e) {
				throw new ServletException();
			}
			
			
		}
			

		

	}
	

	private static boolean isInteger(String str) {
		return str != null && str.matches("[0-9]*");
	}

}
