package dao;
import model.Company;
import util.DatabaseConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompanyDAO {
    public void addCompany(Company company){
        String sql = "INSERT INTO companies" + "(company_name , industry , website , location)" +
        "VALUES (?,?,?,?)";
        //? are placeholders
        try(
            Connection connection = DatabaseConnection.getConnection();
            PreparedStatement statement = connection.prepareStatement(sql);
        ){
            statement.setString(1,company.getCompanyName());
            statement.setString(2,company.getIndustry());
            statement.setString(3,company.getWebsite());
            statement.setString(4,company.getLocation());

            statement.executeUpdate();
            System.out.println("Company added successfully!");
        }
        catch(SQLException e){
            System.out.println("Failed to add company.");
            e.printStackTrace();
        }
    }
    
}
