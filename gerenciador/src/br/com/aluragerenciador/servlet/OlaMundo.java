package br.com.aluragerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns="/teste")
public class OlaMundo extends HttpServlet{
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws IOException {
		PrintWriter out = resp.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html lang='pt-br'>");
		out.println("<head>");
		out.println("<meta charset=”UTF-8”>");
		out.println("<link rel=”stylesheet” type=”text/css” href=”estilo.css”>");
		out.println("<title>Teste Servlet</title>");
		out.println("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\" integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">");
		out.println("</head>");
		out.println("<body style='background: #ccc'>");
		out.println("Aprendendo Servlet java.");
		out.println("<div class=\"alert alert-primary\" role=\"alert\">\r\n" + 
				"  Um simples alerta primary com <a href=\"#\" class=\"alert-link\">um link de exemplo</a>. Clique nele, se quiser.\r\n" + 
				"</div>");
		
		out.println("<div class=\"card\">\r\n" + 
				"  <div class=\"card-header p-5\">\r\n" + 
				"    Destaque\r\n" + 
				"  </div>\r\n" + 
				"  <div class=\"card-body\">\r\n" + 
				"    <h5 class=\"card-title\">Título especial</h5>\r\n" + 
				"    <p class=\"card-text\">Com suporte a texto embaixo, que funciona como uma introdução a um conteúdo adicional.</p>\r\n" + 
				"    <a href=\"#\" class=\"btn btn-primary\">Visitar</a>\r\n" + 
				"  </div>\r\n" + 
				"</div>");
		
		out.println("<input type='text'></input>");
		out.println("<div class=\"input-group mb-3 p-5\">\r\n" + 
				"  <div class=\"input-group-prepend\">\r\n" + 
				"    <span class=\"input-group-text\" id=\"basic-addon1\">@</span>\r\n" + 
				"  </div>\r\n" + 
				"  <input type=\"text\" class=\"form-control\" placeholder=\"Usuário\" aria-label=\"Usuário\" aria-describedby=\"basic-addon1\">\r\n" + 
				"</div>");
		
		out.println("<script>");
		out.println("<script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\" integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\" integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\" crossorigin=\"anonymous\"></script>\r\n" + 
				"<script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\" integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\" crossorigin=\"anonymous\"></script>");
		out.println("</script>");
		out.println("</body>");
		out.println("</html>");
	}

}
