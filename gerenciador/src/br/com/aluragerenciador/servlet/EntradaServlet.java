package br.com.aluragerenciador.servlet;

import java.io.IOException;
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
		if(request == null)
			System.out.println("jesus");
		String paramAcao = request.getParameter("acao");
		System.out.println(paramAcao);
		
		if (paramAcao.equals("ListaEmpresas")) {
			
			ListaEmpresas acao = new ListaEmpresas();
			acao.listandoEmpresas(request, response);
			
		} else 	if (paramAcao.equals("RemoveEmpresa")) {

			RemoveEmpresas acao = new RemoveEmpresas();
			acao.removeEmpresa(request, response);
			
		} else if (paramAcao.equals("AlteraEmpresa")) {
			
			AlteraEmpresa acao = new AlteraEmpresa();
			acao.editEmpresa(request, response);
			
		} else if (paramAcao.equals("MostraEmpresas")) {
			
			MostraEmpresas acao = new MostraEmpresas();
			acao.mostra(request, response);
			
		} else if (paramAcao.equals("NovaEmpresa")) {

			NovaEmpresa acao = new NovaEmpresa();
			acao.criaEmpresa(request, response);
		}
	}

}
