/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Category;
import model.Product;
import model.SizeOfProduct;

/**
 *
 * @author HKDUC
 */
public class ProductDAO extends BaseDAO {
    public ArrayList<Product> getAll(){
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                Product s = new Product();
                s.setProductID(rs.getInt(1));
                s.setProductName(rs.getString(2));
                s.setDescription(rs.getString(3));
                s.setCategoryID(rs.getInt(4));
                s.setImages(getImage(s.getProductID()));
                s.setSizes(getProductInf(s.getProductID()));
                products.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SizeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
    
    public ArrayList<Product> getProductsByCategoryID(int categoryID){
        ArrayList<Product> products = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Product WHERE CategoryID=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, categoryID);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                Product s = new Product();
                s.setProductID(rs.getInt(1));
                s.setProductName(rs.getString(2));
                s.setDescription(rs.getString(3));
                s.setCategoryID(rs.getInt(4));
                s.setImages(getImage(s.getProductID()));
                products.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SizeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return products;
    }
    
    public ArrayList<String> getImage(int ProductID){
        ArrayList<String> imgs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Image WHERE ProductID=?";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, ProductID);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                imgs.add(rs.getString(1));
            }
        } catch (SQLException ex) {
            Logger.getLogger(SizeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imgs;
    }
    
    public ArrayList<Category> getCategories(){
        ArrayList<Category> categories = new ArrayList<>();
        try {
            String sql = "SELECT * FROM Category";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                Category s = new Category();
                s.setCategoryID(rs.getInt("CategoryID"));
                s.setCategoryName(rs.getString("CategoryName"));
                categories.add(s);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return categories;
    }
    
    public ArrayList<SizeOfProduct> getProductInf(int ProductID){
         ArrayList<SizeOfProduct> infs = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SizeOfProduct WHERE ProductID=? ORDER BY Price ASC";
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, ProductID);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                SizeOfProduct inf = new SizeOfProduct();
                inf.setSize(rs.getString(2));
                inf.setPrice(rs.getInt(3));
                inf.setQuantity(rs.getInt(4));
                infs.add(inf);
            }
        } catch (SQLException ex) {
            Logger.getLogger(SizeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return infs;
    }
    
    public ArrayList<String> getSizeList(){
        ArrayList<String> sizes = new ArrayList<>();
        try {
            String sql = "SELECT * FROM SizeTable ORDER BY Stt ASC";
            PreparedStatement statement = connection.prepareStatement(sql);
            ResultSet rs = statement.executeQuery();
            while(rs.next())
            {
                sizes.add(rs.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ProductDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sizes;
    }
}
