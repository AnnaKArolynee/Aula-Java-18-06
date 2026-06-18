
import java.util.Scanner;

class LoginInvalidoException extends Exception {
    public LoginInvalidoException(String mensagem) {
        super(mensagem);
    }
}

class SistemaLogin {
    private String senhaSecreta;

 
    public SistemaLogin() {
        this.senhaSecreta = "123456";
    }

    public void fazerLogin(String usuario, String senha) throws LoginInvalidoException {
    
        if (!this.senhaSecreta.equals(senha)) {
            throw new LoginInvalidoException("Senha incorreta inserida para o usuário: " + usuario);
        }
        

        System.out.println("\nAcesso Permitido! Bem-vindo, " + usuario + ".");
    }
}

public class TesteLogin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SistemaLogin sistema = new SistemaLogin();

        System.out.print("Digite o seu usuário: ");
        String usuario = scanner.nextLine();

        System.out.print("Digite a sua senha: ");
        String senha = scanner.nextLine();

        try {
            sistema.fazerLogin(usuario, senha);
        } catch (LoginInvalidoException e) {
        
            System.out.println("\n Acesso Negado: Credenciais incorretas.");
        } finally {
            scanner.close();
        }
    }
}