package com.careersforyou.jobservice;

import com.careersforyou.jobservice.domain.JobAlreadyExistsException;
import com.careersforyou.jobservice.domain.JobNotFoundException;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class Project4ApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void testJobAlreadyExistsException() {
        String jobId = "123";
        JobAlreadyExistsException exception = new JobAlreadyExistsException(jobId);
        assertEquals("A job with Jobid 123 already exists.", exception.getMessage());
    }

    @Test
    void testJobNotFoundException() {
        String jobId = "456";
        JobNotFoundException exception = new JobNotFoundException(jobId);
        assertEquals("The job with Jobid 456 was not found.", exception.getMessage());
    }
}
