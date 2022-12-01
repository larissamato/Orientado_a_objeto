
public class Livro {

	private String titulo;
	private String categoria;
	
	public Livro(String titulo, String categoria) {
		this.titulo = titulo;
		this.categoria = categoria;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", categoria=" + categoria + "]";
	}
	
}
