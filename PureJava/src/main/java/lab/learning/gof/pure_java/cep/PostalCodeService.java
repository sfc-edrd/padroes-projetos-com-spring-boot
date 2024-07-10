package lab.learning.gof.pure_java.cep;

public class PostalCodeService
{
    private static PostalCodeService instance = new PostalCodeService();
    private PostalCodeService()
    {
        super();
    }

    public PostalCodeService getInstance()
    {
        return instance;
    }
    public static String getCityByPostalCode(String postalCode)
    {
        return "Rio de Janeiro";
    }

    public static String getStateByCity(String city)
    {
        return "RJ";
    }
}
