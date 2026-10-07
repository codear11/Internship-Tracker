import dao.CompanyDAO;
import model.Company;
import java.util.List;

public class Main{
    public  static void main(String[] args){
        CompanyDAO companyDAO = new CompanyDAO();
        List<Company> companies = companyDAO.getAllCompanies();
        for(Company company : companies){
            System.out.println("Company ID:" + company.getCompanyId());
            System.out.println("Comany Name:" + company.getCompanyName());
            System.out.println("Industry:"+company.getIndustry());
            System.out.println("Industry:"+company.getWebsite());
            System.out.println("Industry:"+company.getLocation());
            System.out.println("----------------------");

}
}
}