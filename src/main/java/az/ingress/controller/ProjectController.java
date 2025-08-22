package az.ingress.controller;

import az.ingress.entity.ProjectEntity;
import az.ingress.service.ProjectService;
import lombok.RequiredArgsConstructor;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor

@RequestMapping("v1/projects")
public class ProjectController {


    private  final ProjectService projectService;



    @GetMapping
    public List<ProjectEntity> getAllProjects() {
        return projectService.getAllProjects();
    }

    @GetMapping("/{id}")
    public ProjectEntity getProjectById(@PathVariable Long id) {
        return projectService.getProjectById(id);
    }

    @PostMapping
    public ProjectEntity createProject(@RequestBody ProjectEntity project) {
        return projectService.createProject(project);
    }

    @PutMapping("/{id}")
    public ProjectEntity updateProject(@PathVariable Long id, @RequestBody ProjectEntity project) {
        return projectService.updateProject(id, project);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProject(@PathVariable Long id) {
        projectService.deleteProject(id);
        return ResponseEntity.noContent().build();
    }



}
