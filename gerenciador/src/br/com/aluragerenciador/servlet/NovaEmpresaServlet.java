package br.com.aluragerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		String nomeEmpresa = request.getParameter("nome");
		String enderecoEmpresa = request.getParameter("endereco");
		String cidade = request.getParameter("cidade");
		String estado = request.getParameter("estado");
		
		
		Empresa empresa = new Empresa(1 , nomeEmpresa, enderecoEmpresa, cidade, estado, 91720000 );
		
		Banco banco = new Banco();
		
		banco.adiciona(empresa);
		
		
	}

}
