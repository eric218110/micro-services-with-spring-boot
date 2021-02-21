package com.app.microservices.core.repository.course;

import com.app.microservices.core.model.useCases.CourseModel;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<CourseModel, Long> {
}
