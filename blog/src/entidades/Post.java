package entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

	private Date momento;
	private String titulo;
	private String conteudo;
	private int likes;
	
	private List<Comentario> comentarios = new ArrayList<>();

	public Post() {
		
	}
	
	public Post(Date momento, String titulo, String conteudo, int likes) {
		this.momento = momento;
		this.titulo = titulo;
		this.conteudo = conteudo;
		this.likes = likes;
	}

	public Date getMomento() {
		return momento;
	}

	public void setMomento(Date momento) {
		this.momento = momento;
	}
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getConteudo() {
		return conteudo;
	}
	public void setConteudo(String conteudo) {
		this.conteudo = conteudo;
	}

	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}

	public List<Comentario> getComentarios() {
		return comentarios;
	}
	
	public void addComentario(Comentario comentario) {
		comentarios.add(comentario);
	}
	public void delComentario(Comentario comentario) {
		comentarios.remove(comentario);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(titulo + "\n");
		sb.append(likes);
		sb.append(" Likes \n");
		sb.append(sdf.format(momento) + "\n");
		sb.append(conteudo + "\n");
		sb.append("Comentários: \n");
		for (Comentario c : comentarios) {
			sb.append(c.getTxt() + "\n");
		}
		return sb.toString();
	}
}
