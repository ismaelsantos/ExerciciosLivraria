package br.com.controller;

import java.io.IOException;
import java.io.PrintWriter;
//import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.classes.Livro;

public class Livraria extends HttpServlet {

	private static final long serialVersionUID = -8057490544236150067L;

    public Livraria() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
	
	    String titulo = request.getParameter("titulo");
	    String autor = request.getParameter("autor");
	    String descricao = request.getParameter("descricao");
	
	    Livro livro = new Livro();
	    livro.setTitulo(titulo);
	    livro.setAutor(autor);
	    livro.setDescricao(descricao);
	
	    out.println(livro.getTitulo());
	    out.println(livro.getAutor());
	    out.println(livro.getDescricao());
	    
	    //RequestDispatcher dispatcher = request.getRequestDispatcher("/index.jsp");
	    //dispatcher.forward(request, response);
		}

}
