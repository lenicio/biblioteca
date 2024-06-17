public class Aluno extends Pessoa {
  private String matricula;

  public Aluno(String nome, String cpf, String matricula) {
    super(nome, cpf);
    this.matricula = matricula;
  }

  // Getters e Setters
  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }
}