package lab.learning.gof.pure_java.facade;

import lab.learning.gof.pure_java.crm.CrmService;
import lab.learning.gof.pure_java.cep.PostalCodeService;

public class Facade
{
    private static void migrateCustomer(String name, String postalCode)
    {
        String city = PostalCodeService.getCityByPostalCode(postalCode);
        String state = PostalCodeService.getStateByCity(city);

        CrmService.createCustomer(name, postalCode, city, state);
        CrmService.getCustomerList();
    }

    public static void main(String[] args) {
        migrateCustomer(
                "Felipe Gomes",
                "200000"
        );
        migrateCustomer(
                "Alex Gomes",
                "200000"
        );
    }
}
