package lab.learning.gof.pure_java.crm;

import lab.learning.gof.pure_java.facade.Customer;

import java.util.ArrayList;
import java.util.List;

public class CrmService
{
    private static List<Customer> customerList;

    private CrmService()
    {
        super();
    }

    static
    {
        customerList = new ArrayList<>();
    }
    public static void createCustomer(
            String name,
            String postalCode,
            String city,
            String state)
    {
        System.out.println("Cliente criado com sucesso.\n");
        customerList.add(
                new Customer(
                        name,
                        postalCode,
                        city,
                        state
                )
        );
    }

    public static void getCustomerList()
    {
        System.out.println("Listando todos os clientes:");
        customerList
            .stream()
            .forEach(System.out::println);
        System.out.println();
    }
}
