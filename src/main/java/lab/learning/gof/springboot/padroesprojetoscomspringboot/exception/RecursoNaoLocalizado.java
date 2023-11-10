package lab.learning.gof.springboot.padroesprojetoscomspringboot.exception;

public class RecursoNaoLocalizado extends RuntimeException
{
    private String message;

    public RecursoNaoLocalizado(String message)
    {
        this.message = message;
    }

    @Override
    public String getMessage()
    {
        return message;
    }
}
