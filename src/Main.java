public class Main {
  public static void main(String[] args) {
    Biblioteca biblioteca = new Biblioteca();

    Livro livro1 = new Livro("O Senhor dos Anéis", "J.R.R. Tolkien", "123456789", 1954);
    Livro livro2 = new Livro("Harry Potter", "J.K. Rowling", "987654321", 1997);

    biblioteca.adicionarLivro(livro1);
    biblioteca.adicionarLivro(livro2);

    Aluno aluno = new Aluno("João", "12345678900", "20231234");
    Professor professor = new Professor("Maria", "09876543211", "Letras");

    biblioteca.adicionarPessoa(aluno);
    biblioteca.adicionarPessoa(professor);

    biblioteca.emprestarLivro(livro1, aluno);
    biblioteca.emprestarLivro(livro2, professor);

    biblioteca.listarLivrosDisponiveis();

    biblioteca.retornarLivro(livro1, aluno);
    biblioteca.retornarLivro(livro2, professor);

    biblioteca.listarLivrosDisponiveis();
  }
}
