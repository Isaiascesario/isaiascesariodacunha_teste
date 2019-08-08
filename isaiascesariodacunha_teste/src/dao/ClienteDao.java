package dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import conexao.ConnectionFactory;
import isaiascesariodacunha_teste.Cliente;

public class ClienteDao {
	// a conexao com o banco de dados
	private Connection connection;

	public ClienteDao() {
		try{
			this.connection = ConnectionFactory.getConnection();
		}
		catch(Exception e)
		{
			System.out.println("Erro na abertura do banco de dados: " + e.getMessage());
		}
	}

	public List<Cliente> getLista(){
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from tb_customer_account where id_customer >=1500 AND id_customer <= 2700 AND vl_total > 560 ORDER by vl_total DESC");
			ResultSet rs = stmt.executeQuery();

			List<Cliente> clientes = new ArrayList<Cliente>();

			while (rs.next()) {
					Cliente cliente = new Cliente(rs.getInt("id_customer"),rs.getString("cpf_cnpj"),rs.getString("nm_customer"),rs.getInt("is_active"),rs.getDouble("vl_total"));
					clientes.add(cliente);
			}
			rs.close();
			stmt.close();
			return clientes;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}

	public void adiciona(Cliente cliente) {
		String sql = "insert into tb_customer_account (id_customer,cpf_cnpj,nm_customer,is_active,vl_total) values (?,?,?,?,?)";
		try {
			// prepared statement para insercao
			PreparedStatement stmt = connection.prepareStatement(sql);
			stmt.setLong(1,cliente.getIdCustomer());
			stmt.setString(2,cliente.getCpfCnpj());
			stmt.setString(3,cliente.getNome());
			stmt.setLong(4,cliente.getIsActive());
			stmt.setDouble(5,cliente.getVlTotal());
			// executa
			stmt.execute();
			stmt.close();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public Cliente getPesquisar(int id){
		Cliente cliente = null;
		try{
			PreparedStatement stmt = this.connection.prepareStatement("select * from tb_customer_account");
			ResultSet rs = stmt.executeQuery();
			while (rs.next()) {
				if(id == rs.getInt("conta")){
					cliente = new Cliente(rs.getInt("id_customer"),rs.getString("cpf_cnpj"),rs.getString("nm_customer"),rs.getInt("is_active"),rs.getDouble("vl_total"));
					
				}
			}
			rs.close();
			stmt.close();
			return cliente;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}	
}

