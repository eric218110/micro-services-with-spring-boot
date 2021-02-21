package com.app.microservices.course.endPoint.services;


import com.app.microservices.core.model.useCases.CourseModel;
import com.app.microservices.core.repository.course.CourseRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@RequiredArgsConstructor(onConstructor = @__(@Autowired))
@Service
@Slf4j
public class CourseService {

    private final CourseRepository courseRepository;

    public Iterable<CourseModel> list (Pageable pageable){
        log.info("List all Coursers");
        return courseRepository.findAll(pageable);
    }
}
