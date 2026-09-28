import dao.CompanyDAO;
import model.Company;

public class Main{
    public  static void main(String[] args){
        Company company = new Company(
            "Google","Technology","https://google.com","Bangalore"
        );
        CompanyDAO companyDAO = new CompanyDAO();
        companyDAO.addCompany(company);
}
}