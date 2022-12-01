public class Livro {

	private String titulo;
	private String autor;
	private String editora;
	
	public Livro(String titulo, String autor, String editora) {
		this.titulo = titulo;
		this.autor = autor;
		this.editora = editora;
	}
	
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;		
	}
	
	public String getTitulo() {
		return titulo;
	}		
	
	public String getAutor() {
		return autor;
	}	
	
	public String getEditora() {
		return editora;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Livro other = (Livro) obj;
		if (autor == null && other.autor != null)
			return false;
		if (!autor.equals(other.autor))
			return false;
		if (editora == null && other.editora != null)
			return false;
		if (!editora.equals(other.editora))
			return false;
		if (titulo == null && other.titulo != null)
			return false;
		if (!titulo.equals(other.titulo))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "\n\tLivro [titulo=" + titulo + ", autor=" + autor + ", editora=" + editora + "]";
	}	
}


