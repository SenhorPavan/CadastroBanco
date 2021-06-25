package Utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BanquinhoDadinhos {

    private static final String DRIVER = "org.postgresql.Driver";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "senai";
    private static final String URL = "jdbc:postgresql://localhost:5432/banco_dados_primeiro";
    private static Connection conexao = null;

    public static Connection CriarConexao() {
        if (conexao == null) {
            try {
                Class.forName(DRIVER);
                conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
                System.out.println("CONEXÃO FEITA COM SUCESSO");
            } catch (ClassNotFoundException | SQLException e) {
                System.out.println("NÃO FOI POSSÍVEL CONECTAR COM O BANCO DE DADOS");
            }
        }
        return conexao;
    }
}
