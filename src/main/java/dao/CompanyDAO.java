package dao;
import model.Company;
import util.DatabaseConnection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

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
public List<Company> getAllCompanies(){
    List<Company> companies = new ArrayList<>();
    String sql = "SELECT * FROM companies";
    try(
        Connection connection = DatabaseConnection.getConnection();
        PreparedStatement statement = connection.prepareStatement(sql);
        ResultSet resultSet = statement.executeQuery();
    ){
        while(resultSet.next()){
            Company company = new Company(
                resultSet.getInt("company_id"),
                resultSet.getString("company_name"),
                resultSet.getString("industry"),
                resultSet.getString("website"),
                resultSet.getString("location")
            );
            companies.add(company);
        }
    }
    catch(SQLException e){
        System.out.println("Failed to retrive companies.");
        e.printStackTrace();
    }
    return companies;
}
    
}
