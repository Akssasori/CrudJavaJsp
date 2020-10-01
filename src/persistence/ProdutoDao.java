package persistence;

import java.util.ArrayList;
import java.util.List;

import entity.Produto;

public class ProdutoDao extends Dao{
	
	//esta abrindo a conexao com o banco, stmt responsavel por enviar info pro branco e setando os valores dentro da tabela do banco 
	public void create(Produto p)throws Exception{
		
		open();
		stmt = con.prepareStatement("insert into produto values(null,?,?,?,?)");
		stmt.setInt(1, p.getIdProduto());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getDescricao());
		stmt.setDouble(4, p.getPreco());
		stmt.setString(5, p.getImagem());
		stmt.execute();
		close();		
		
	}
	//lista Produto e busca todos
	public List<Produto>findAll()throws Exception{
		open();
		stmt = con.prepareStatement("select*from produto order by id desc");
		rs = stmt.executeQuery();
		List<Produto> lista = new ArrayList<Produto>();
		while(rs.next()) {
			
			Produto p = new Produto();
			p.setIdProduto(rs.getInt(1));
			p.setNome(rs.getString(2));
			p.setDescricao(rs.getString(3));
			p.setPreco(rs.getDouble(4));
			p.setImagem(rs.getString(5));
			lista.add(p);
			
		}
		close();
		return lista;
		
		
	}
	
	public Produto findByCode(Integer cod)throws Exception{
		open();
		stmt = con.prepareStatement("select*from produto where id=?");
		stmt.setInt(1, cod);
		rs = stmt.executeQuery();
		Produto p = null;
		if(rs.next()) {
			
			p = new Produto();
			p.setIdProduto(rs.getInt(1));
			p.setNome(rs.getString(2));
			p.setDescricao(rs.getString(3));
			p.setPreco(rs.getDouble(4));
			p.setImagem(rs.getString(5));
			
		}
		close();
		return p;
		
	}
	
	public void delete(Integer cod)throws Exception{
		open();
		stmt = con.prepareStatement("delete from produto where id = ?");
		stmt.setInt(1, cod);
		stmt.execute();
		close();
	}
	
	public void update(Produto p)throws Exception{
		open();
		//comando sql de update
		stmt = con.prepareStatement("update produto set nome = ?,descricao = ?,preco =?, imagem = ? where id =?");
		stmt.setInt(1, p.getIdProduto());
		stmt.setString(2, p.getNome());
		stmt.setString(3, p.getDescricao());
		stmt.setDouble(4, p.getPreco());
		stmt.setString(5, p.getImagem());
		stmt.execute();
		close();
	}

	
}
