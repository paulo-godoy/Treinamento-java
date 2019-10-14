package br.com.aluragerenciador.servlet;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

//@WebFilter("/entrada")
public class MonitoramentoFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		//Monitoramento do tempoi de execu��o do systema
		 long antes = System.currentTimeMillis();
		 
		 String acao = request.getParameter("acao");
		 
		 //o Chain executa o fluxo das que foi solicitado
		 chain.doFilter(request, response);
		 
		 long depois = System.currentTimeMillis();
		 System.out.println("Tempo de execu��o da ac�o " + acao + ": " + ( depois - antes ) + " milisegundos.");
		
	}
	
}
