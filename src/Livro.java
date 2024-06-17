public class Livro {
  private String titulo;
  private String autor;
  private String ISBN;
  private int anoPublicacao;
  private boolean status; // true para disponível, false para emprestado

  public Livro(String titulo, String autor, String ISBN, int anoPublicacao) {
    this.titulo = titulo;
    this.autor = autor;
    this.ISBN = ISBN;
    this.anoPublicacao = anoPublicacao;
    this.status = true; // livro inicialmente disponível
  }

  // Getters e Setters
  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public String getAutor() {
    return autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getISBN() {
    return ISBN;
  }

  public void setISBN(String ISBN) {
    this.ISBN = ISBN;
  }

  public int getAnoPublicacao() {
    return anoPublicacao;
  }

  public void setAnoPublicacao(int anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
  }

  public boolean isDisponivel() {
    return status;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public void exibirInformacoes() {
    System.out.println("Título: " + titulo);
    System.out.println("Autor: " + autor);
    System.out.println("ISBN: " + ISBN);
    System.out.println("Ano de Publicação: " + anoPublicacao);
    System.out.println("Status: " + (status ? "Disponível" : "Emprestado"));
  }
}
