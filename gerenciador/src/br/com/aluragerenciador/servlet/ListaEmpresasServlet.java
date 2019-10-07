package br.com.aluragerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListaEmpresasServlet
 */
@WebServlet("/listaEmpresasServlet")
public class ListaEmpresasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter saida = response.getWriter();
		Banco banco = new Banco();
		
		List<Empresa> lista = banco.getEmpresas();
		
		
		saida.println("<!DOCTYPE html>");
		saida.println("<html lang='pt-br'>");
		saida.println("<head>");
		saida.println("<meta charset=�UTF-8�>");
		saida.println("<link rel=�stylesheet� type=�text/css� href=�estilo.css�>");
		saida.println("<title>Teste Servlet</title>");
		saida.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">");
		saida.println("</head>");
		saida.println("<body style='background: #ccc'>");
		saida.println("<div class=\"container\">");
		saida.println("<table class=\"table table-hover\">\r\n" + 
				"  <thead>\r\n" + 
				"    <tr>\r\n" + 
				"      <th scope=\"col\">Nome</th>\r\n" + 
				"      <th scope=\"col\">Endere�o</th>\r\n" + 
				"      <th scope=\"col\">Cidade</th>\r\n" + 
				"      <th scope=\"col\">Estado</th>\r\n" + 
				"    </tr>\r\n" + 
				"  </thead>\r\n");
		
		for (Empresa empresa : lista) {
			saida.println("<tbody>");
			saida.println("<tr>");
			saida.println("<td>" + empresa.getNome() + "</td>");  
			saida.println("<td>" + empresa.getEndereco() + "</td>"); 
			saida.println("<td>" + empresa.getCidade() + "</td>"); 
			saida.println("<td>" + empresa.getEstado() + "</td>"); 
			saida.println("</tbody>");
		}
		
		saida.println("</table>");
		
		saida.println("<a class=\"btn btn-primary\" href=\"/gerenciador/formNovaEmpresa.html\" role=\"button\">Voltar ao cadastro</a>");
		saida.println("</div");
		
		saida.println("<script>");
		saida.println("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>");
		saida.println("</script>");
		saida.println("</body>");
		saida.println("</html>");
	}

}
