package lesson9;

import lesson9.utils.Checker;

public class Demo {
    public static void main(String[] args) {
        Company company = new Company("Google", "Ukraine");
        System.out.println(company.getName());
        System.out.println(company.getName());

        //company.name = "NewValue";

        //company.name = "IBM";

        Checker checker = new Checker();
        System.out.println(checker.checkCompanyName(company.getName()));
        //System.out.println(checker.companyNameValidatedCount);

    }
}
