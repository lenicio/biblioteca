import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
  private List<Livro> livros;
  private List<Pessoa> pessoas;

  public Biblioteca() {
    this.livros = new ArrayList<>(); // Inicializa a lista aqui
    this.pessoas = new ArrayList<>(); // Inicializa a lista aqui
  }

  public void adicionarLivro(Livro livro) {
    this.livros.add(livro);
  }

  public void emprestarLivro(Livro livro, Pessoa pessoa) {
    if (livro.isDisponivel()) {
      livro.setStatus(false);
      pessoa.adicionarLivro(livro);
      System.out.println("Livro " + livro.getTitulo() + " emprestado para " + pessoa.getNome());
    } else {
      System.out.println("Livro " + livro.getTitulo() + " não está disponível.");
    }
  }

  public void retornarLivro(Livro livro, Pessoa pessoa) {
    if (pessoa.getLivrosEmprestados().contains(livro)) {
      livro.setStatus(true);
      pessoa.removerLivro(livro);
      System.out.println("Livro " + livro.getTitulo() + " retornado por " + pessoa.getNome());
    } else {
      System.out.println("Livro " + livro.getTitulo() + " não pertence a " + pessoa.getNome());
    }
  }

  public void listarLivrosDisponiveis() {
    System.out.println("Livros disponíveis:");
    for (Livro livro : livros) {
      if (livro.isDisponivel()) {
        livro.exibirInformacoes();
      }
    }
  }

  public void adicionarPessoa(Pessoa pessoa) {
    this.pessoas.add(pessoa);
  }
}
