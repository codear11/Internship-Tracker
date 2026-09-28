package model;
public class Company{
    private int companyId;
    private String companyName;
    private String industry;
    private String website;
    private String location;

    public Company(){}
        public Company(String companyName , String industry , String website , String location){
            this.companyName = companyName;
            this.industry = industry;
            this.website = website;
            this.location = location;
        }
        public Company(int companyId , String companyName , String industry , String website , String location){
            this.companyId= companyId;
            this.companyName = companyName;
            this.industry = industry;
            this.website = website;
            this.location=location;
        }
        public int getCompanyId(){
            return companyId;
        }
        public void setCompanyId(int companyId){
            this.companyId = companyId;
        }
        public String getCompanyName(){
            return companyName;
        }
        public void setCompanyName(String companyName){
            this.companyName = companyName;
        }
        public String getIndustry(){
            return industry;
        }
        public void setIndustry(String industry){
            this.industry=industry;
        }
        public String getWebsite(){
            return website;
        }
        public void setWebsite(String website){
            this.website = website;
        }
        public String getLocation(){
            return location;
        }
        public void setLocation(String location){
            this.location = location;
        }
    }
