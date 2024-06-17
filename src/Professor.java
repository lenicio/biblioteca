public class Professor extends Pessoa {
  private String departamento;

  public Professor(String nome, String cpf, String departamento) {
    super(nome, cpf);
    this.departamento = departamento;
  }

  // Getters e Setters
  public String getDepartamento() {
    return departamento;
  }

  public void setDepartamento(String departamento) {
    this.departamento = departamento;
  }
}