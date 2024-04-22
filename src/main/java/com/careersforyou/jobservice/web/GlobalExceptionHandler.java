package com.careersforyou.jobservice.web;
import com.careersforyou.jobservice.domain.JobAlreadyExistsException;
import com.careersforyou.jobservice.domain.JobNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(JobNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ResponseBody
    public String handleJobNotFoundException(JobNotFoundException ex) {
        return ex.getMessage();
    }

    @ExceptionHandler(JobAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    @ResponseBody
    public String handleJobAlreadyExistsException(JobAlreadyExistsException ex) {
        return ex.getMessage();
    }
}

