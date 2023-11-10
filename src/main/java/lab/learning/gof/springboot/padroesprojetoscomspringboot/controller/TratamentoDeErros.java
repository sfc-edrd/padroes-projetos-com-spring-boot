package lab.learning.gof.springboot.padroesprojetoscomspringboot.controller;

import lab.learning.gof.springboot.padroesprojetoscomspringboot.exception.RecursoNaoLocalizado;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@RestControllerAdvice
public class TratamentoDeErros extends ResponseEntityExceptionHandler
{
    @ExceptionHandler()
    @ResponseStatus(HttpStatus.NOT_MODIFIED)
    public String recursoNaoLocalizado(RecursoNaoLocalizado recursoNaoLocalizado)
    {
        return recursoNaoLocalizado.getMessage();
    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(
            MissingPathVariableException ex,
            HttpHeaders headers,
            HttpStatusCode status,
            WebRequest request)
    {
        return ResponseEntity.status(status.value()).body(ex);
    }
}
