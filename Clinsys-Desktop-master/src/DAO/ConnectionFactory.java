package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class ConnectionFactory {

    private String host = "127.0.0.1";
    private int port = 3306; // Sua porta do MySQL
    private String user = "root";
    private String password = "Aluno@12";
    private String db = "clinsys";
    private String url = "jdbc:mysql://" + host + ":" + port + "/" + db + "?useSSL=false&serverTimezone=UTC";

    public Connection getConnection() {
        try {
            // Tenta carregar o driver do MySQL
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
            
            // Retorna a conexão com o banco de dados
            return DriverManager.getConnection(url, user, password);
            
        } catch (Exception e) {
            // Imprime a stack trace completa da exceção no console
            e.printStackTrace();
            
            // Exibe um diálogo informando que a conexão falhou
            JOptionPane.showMessageDialog(null, "Não foi possível conectar.\n" + e.getMessage());
            
            return null; // Retorna null em caso de falha
        }
    }

    public static void main(String[] args) {
        // Cria uma instância da fábrica de conexões
        ConnectionFactory connectionFactory = new ConnectionFactory();
        
        // Tenta obter uma conexão e verifica se a conexão foi estabelecida
        Connection connection = connectionFactory.getConnection();
        
        if (connection != null) {
            System.out.println("Conexão estabelecida com sucesso!");
        } else {
            System.out.println("Falha ao estabelecer conexão.");
        }
    }
}
