package Program;

public class Client {
    private static int counter = 1;
    private String nome;
    private String CPF;
    private String password;
    private String email;

    public Client(String nome, String CPF, String password, String email) {
        this.nome = nome;
        this.CPF = CPF;
        this.password = password;
        this.email = email;
        counter += 1;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
       return "\nNome:" + this.getNome() +
               "\nCPF:" + this.getCPF() +
               "\nEmail:" + this.getEmail();
    }
}
