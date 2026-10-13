package Person;

public class Funcionario {

    private String nome;
    private String email;
    private String senha;
    private boolean adminStatus;

    public Funcionario(String nome, String email, String senha, boolean adminStatus) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Boolean getAdminStatus() {
        return adminStatus;
    }

    public void setAdminStatus(Boolean adminStatus) {
        this.adminStatus = adminStatus;
    }

    public boolean realizarLogin(String emailInformado, String senhaInformada) {
        if (this.email != null && this.senha != null) {
            return this.email.equals(emailInformado) && this.senha.equals(senhaInformada);
        }
        return false;
    }

    public boolean realizarLogout(){
        return true;
    }

    public void alterarDados(String novoEmail){
        this.email = novoEmail;
    }

    public void alterarSenha(String novaSenha){
        this.senha = novaSenha;
    }

}
