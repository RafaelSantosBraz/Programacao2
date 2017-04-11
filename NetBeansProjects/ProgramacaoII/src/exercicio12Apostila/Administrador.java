package exercicio12Apostila;

public class Administrador {

    private int codigo;
    private String nome, login, senha;

    public Administrador() {
        codigo = 0;
        nome = login = senha = "";
    }

    public boolean logar(String login, String senha) {
        if (this.login.equals(login) && this.senha.equals(senha)) {
            return true;
        }
        return false;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
