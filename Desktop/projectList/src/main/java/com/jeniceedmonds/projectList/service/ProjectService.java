package com.jeniceedmonds.projectList.service;

import com.jeniceedmonds.projectList.exception.ProjectNotFoundException;
import model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ProjectRepo;


import java.util.List;
import java.util.UUID;

@Service
public class ProjectService {
    private ProjectRepo projectRepo;

    @Autowired
    public ProjectService(ProjectRepo projectRepo){
        this.projectRepo = projectRepo;
    }

        public Project addProject(Project project){
        project.setProjectCode(UUID.randomUUID().toString());
            return projectRepo.save(project);
        }

        public List<Project> findAllProjects(){
        return (List<Project>) projectRepo.findAll();
        }

        public Project updateProject(Project project){
            return projectRepo.save(project);
        }

        public Project findProjectById(Long id){
            return projectRepo.findProjectById(id).orElseThrow(() -> new ProjectNotFoundException("Project by id" + id + "was not found"));
        }

        public void deleteProject(Long id){
            projectRepo.deleteProjectById(id);
    }
}
