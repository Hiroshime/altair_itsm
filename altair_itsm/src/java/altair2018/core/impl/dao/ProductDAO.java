/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package altair2018.core.impl.dao;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import altair2018.domain.Category;
import altair2018.domain.DomainEntity;


/**
 *
 * @author Luiz
 */
public class ProductDAO extends AbstractJdbcDAO {
    
    public ProductDAO()
    {
        super("tb_product", "id");
    }
    
    public void save(DomainEntity entity)
    {
       /* openConnection();
        PreparedStatement pst=null;
        Product product = (Product)entity;
        
        try 
        {
		connection.setAutoCommit(false);			
		StringBuilder sql = new StringBuilder();			
		
                //INSERT DE CONTATOS EMERGENCIAIS
                sql.append("INSERT INTO tb_product(name,description,nutritionTable,id_category,id_brand,dt_reg,price,quantity) VALUES (?,?,?,?,?,?,?,?)");
                pst = connection.prepareStatement(sql.toString());
                pst.setString(1, product.getName());
                pst.setString(2, product.getDescription());
                pst.setString(3, product.getNutritionTable());
                pst.setInt(4, product.getCategory().getId());
                pst.setInt(5, product.getBrand().getId());
                java.sql.Date dateSQL = new java.sql.Date(product.getDtCadastro().getTime());
                pst.setDate(6, dateSQL);
                pst.setDouble(7, product.getPrice());
                pst.setInt(8, product.getQuantity());
                pst.executeUpdate();			
		connection.commit();
                
                
                
                
                		
	} 
        catch (SQLException e) 
        {
			try 
                        {
				connection.rollback();
			} 
                        catch (SQLException e1) 
                        {
				e1.printStackTrace();
			}
			e.printStackTrace();			
	}
        finally
        {
			try 
                        {
				pst.close();
				connection.close();
			} 
                        catch (SQLException e) 
                        {
				e.printStackTrace();
			}
	}		
    */}
    
    /**
     * 
     * @param entity 
     */    
    @Override
    public void change(DomainEntity entity)
    {
       /* openConnection();
        PreparedStatement pst = null;
        Product product = (Product)entity;
        
        try
        {
            connection.setAutoCommit(false);
            
            StringBuilder sql = new StringBuilder();
            sql.append("UPDATE tb_product SET"
                    + " name=?, "
                    + " description=?, "
                    + "nutritionTable=?, "
                    + "id_category=?, "
                    + "id_brand=?, "
                    + "price=? "
                    + " WHERE id=? ");
            
            pst = connection.prepareStatement(sql.toString());
            pst.setString(1, product.getName());
            pst.setString(2, product.getDescription());
            pst.setString(3, product.getNutritionTable());
            pst.setInt(4, product.getCategory().getId());
            pst.setInt(5, product.getBrand().getId());
            pst.setDouble(6, product.getPrice());
            pst.setInt(7, product.getId());
            pst.executeUpdate();			
            connection.commit();
            
        }
        catch (SQLException e) 
        {
			try 
                        {
				connection.rollback();
			} 
                        catch (SQLException e1) 
                        {
				e1.printStackTrace();
			}
			e.printStackTrace();			
	}
        finally
        {
			try 
                        {
				pst.close();
				connection.close();
			} 
                        catch (SQLException e) 
                        {
				e.printStackTrace();
			}
	}
        
   */ }
    /**
     * 
     * @param entity
     * @return List of entities
     */
    @Override
    public List<DomainEntity> consult(DomainEntity entity)
    {
        
       /*PreparedStatement pst =null;
        String sql = null;
        Product product = (Product)entity;
        
        if(product.getName() == null || product.getName().equals("") )
            sql = "SELECT prd.id,"
                    + "prd.name,"
                    + "prd.dt_reg,"
                    + "prd.description,"
                    + "bra.id,"
                    + "bra.name, "
                    + "cat.id, "
                    + "cat.name, "
                    + "prd.price, "
                    + "prd.quantity,"
                    + "prd.nutritionTable "
                    + "FROM (tb_product as prd) "
                    + "INNER JOIN (tb_brand as bra) ON (prd.id_brand = bra.id) "
                    + "INNER JOIN (tb_category as cat) ON (prd.id_category = cat.id)";
        
        
        else
            sql = "SELECT prd.id,"
                    + "prd.name,"
                    + "prd.dt_reg,"
                    + "prd.description,"
                    + "bra.id,"
                    + "bra.name, "
                    + "cat.id, "
                    + "cat.name, "
                    + "prd.price, "
                    + "prd.quantity, "
                    + "prd.nutritionTable "
                    + "FROM (tb_product as prd) "
                    + "INNER JOIN (tb_brand as bra) ON (prd.id_brand = bra.id) "
                    + "INNER JOIN (tb_category as cat) ON (prd.id_category = cat.id)"
                    + "WHERE prd.name=?";
        
                    
        try
        {
            openConnection();
            pst = connection.prepareStatement(sql);
            if(product.getName() != null && !product.getName().equals(""))
            {
                pst.setString(1, product.getName());
            }
            String teste = pst.toString();
            
            ResultSet reset = pst.executeQuery();
            List<DomainEntity> products = new ArrayList<>();
            while(reset.next())
            {
                Product prod = new Product();
                Brand bd = new Brand();
                Category cat = new Category();
                prod.setId(reset.getInt("prd.id"));
                prod.setName(reset.getString("prd.name"));;
                java.sql.Date dtGenerica = reset.getDate("prd.dt_reg");
                Date dtNormal = new Date(dtGenerica.getTime());
                prod.setDescription(reset.getString("prd.description"));
                prod.setPrice(reset.getDouble("prd.price"));
                prod.setQuantity(reset.getInt("prd.quantity"));
                prod.setNutritionTable(reset.getString("prd.nutritionTable"));
                cat.setId(reset.getInt("cat.id"));
                cat.setName(reset.getString("cat.name"));
                prod.setCategory(cat);
                prod.setDtCadastro(dtNormal);
                bd.setId(reset.getInt("bra.id"));
                bd.setName(reset.getString("bra.name"));
                prod.setBrand(bd);
                products.add(prod);
                
            }
            return products;
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
*/
        return null;
    }
    
    
    
    public DomainEntity view(DomainEntity entity)
    {
       /* 
        PreparedStatement pst =null;
        String sql = null;
        Product product = (Product)entity;
        
        

        try
        {
            openConnection();
            
            if( product.getName() != null &&!product.getName().equals(""))
            {
                sql = "SELECT prd.id,"
                + "prd.name,"
                + "prd.description,"
                + "prd.nutritionTable,"
                + "prd.id_category,"
                + "prd.dt_reg,"
                + "prd.quantity,"
                + "bra.id,"
                + "bra.name, "
                + "prd.price, "
                + "cat.id,"
                + "cat.name " 
                + " FROM (tb_product as prd) "
                + " INNER JOIN (tb_brand as bra) ON (prd.id_brand = bra.id) "
                + "INNER JOIN (tb_category as cat) ON (prd.id_category = cat.id) "
                + "WHERE prd.name=?";
                
                pst = connection.prepareStatement(sql);
                pst.setString(1, product.getName());
            }
            if(product.getId() != null && product.getId() > 0)
            {
                sql = "SELECT prd.id,"
                + "prd.name,"
                + "prd.description,"
                + "prd.nutritionTable,"
                + "prd.id_category,"
                + "prd.dt_reg,"
                + "prd.quantity,"
                + "bra.id,"
                + "bra.name, "
                + "prd.price, "
                + "cat.id,"
                + "cat.name " 
                + " FROM (tb_product as prd) "
                + " INNER JOIN (tb_brand as bra) ON (prd.id_brand = bra.id) "
                + "INNER JOIN (tb_category as cat) ON (prd.id_category = cat.id) "
                + "WHERE prd.id=?";
                
                pst = connection.prepareStatement(sql);
                pst.setInt(1, product.getId());
            }
            
            ResultSet reset = pst.executeQuery();
             while(reset.next())
            {
                Product pd = new Product();
                Brand bd = new Brand();
                pd.setId(reset.getInt("prd.id"));
                pd.setName(reset.getString("prd.name"));
                pd.setDescription(reset.getString("prd.description"));;
                pd.setNutritionTable(reset.getString("prd.nutritionTable"));
                pd.setPrice(reset.getDouble("prd.price"));
                pd.setQuantity(reset.getInt("prd.quantity"));
                Category cat = new Category();
                cat.setId(reset.getInt("cat.id"));
                cat.setName(reset.getString("cat.name"));
                pd.setCategory(cat);
                java.sql.Date dtGenerica = reset.getDate("prd.dt_reg");
                Date dtNormal = new Date(dtGenerica.getTime());
                pd.setDtCadastro(dtNormal);
                bd.setId(reset.getInt("bra.id"));
                bd.setName(reset.getString("bra.name"));
                pd.setBrand(bd);
                
                return pd;
            }
        }
        catch(SQLException e)
        {
            e.printStackTrace();
        }
*/
        return null;
        
        
    }
}
