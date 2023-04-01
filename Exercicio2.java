import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public void save(Item item){
    private final static String url = "jdbc:oracle:thin:@localhost:1521/dihphilips";
    private final static String user = "root";
    private final static String password = "root";
    try (Connection connection = DriverManager.getConnection(url, user, password)){
        
        String sql = "INSERT INTO itens (nome, descricao) VALUES ('Arroz', 'Arroz do tipo A')";
        PreparedStatement ps = connection.prepareStatement(sql);

        ps.execute();
        ps.close();
    } catch (SQLException e) {
        throw new RuntimeException(String.format("Ocorreu um erro ao tentar inserir item. %s", e.getMessage()));
    }
    
}