package repository;

import model.Project;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface ProjectRepo extends CrudRepository<Project, Long> {
    void deleteProjectById(Long id);

    Optional <Project>findProjectById(Long id);
}
