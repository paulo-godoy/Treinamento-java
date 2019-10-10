package br.com.aluragerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.acao.ListaEmpresas;
import br.com.alura.gerenciador.acao.AlteraEmpresa;
import br.com.alura.gerenciador.acao.MostraEmpresas;
import br.com.alura.gerenciador.acao.NovaEmpresa;
import br.com.alura.gerenciador.acao.RemoveEmpresas;


@WebServlet("/entrada")
public class EntradaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String paramAcao = request.getParameter("acao");
		
		String nome = null;
		
		
		if (paramAcao.equals("ListaEmpresas")) {
			
			ListaEmpresas acao = new ListaEmpresas();
			nome = acao.listandoEmpresas(request, response);
			
			
			
		} else 	if (paramAcao.equals("RemoveEmpresa")) {

			RemoveEmpresas acao = new RemoveEmpresas();
			nome = acao.removeEmpresa(request, response);
			
		} else if (paramAcao.equals("AlteraEmpresa")) {
			
			AlteraEmpresa acao = new AlteraEmpresa();
			nome = acao.editEmpresa(request, response);
			
		} else if (paramAcao.equals("MostraEmpresas")) {
			
			MostraEmpresas acao = new MostraEmpresas();
			nome = acao.mostra(request, response);
			
		} else if (paramAcao.equals("NovaEmpresa")) {

			NovaEmpresa acao = new NovaEmpresa();
			nome = acao.criaEmpresa(request, response);
		}
		
		String[] tipoEndereco = nome.split(":");
		if (tipoEndereco[0].equals("forward")) {
			RequestDispatcher rd = request.getRequestDispatcher(tipoEndereco[1]);
			rd.forward(request, response);
		} else {
			response.sendRedirect(tipoEndereco[1]);
		}
		
	}

}
