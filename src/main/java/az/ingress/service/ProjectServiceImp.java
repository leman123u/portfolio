package az.ingress.service;

import az.ingress.entity.ProjectEntity;

import java.util.List;

public interface ProjectServiceImp {
    List<ProjectEntity> getAllProjects();

    ProjectEntity getProjectById(Long id);

    ProjectEntity createProject(ProjectEntity projectEntity);

    ProjectEntity updateProject(Long id ,ProjectEntity project);
     void deleteProject(Long id);



}
