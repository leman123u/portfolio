package az.ingress.controller;

import az.ingress.entity.BlogEntity;
import az.ingress.service.BlogService;
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
@RequestMapping("v1/blog")
public class BlogController {


    private  final BlogService blogService;



    @GetMapping
    public List<BlogEntity> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public BlogEntity getBlogById(@PathVariable Long id) {
        return blogService.getBlogById(id);
    }

    @PostMapping
    public BlogEntity createBlog(@RequestBody BlogEntity blog) {
        return blogService.createBlog(blog);
    }

    @PutMapping("/{id}")
    public BlogEntity updateBlog(@PathVariable Long id, @RequestBody BlogEntity blog) {
        return blogService.updateBlog(id, blog);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteBlog(@PathVariable Long id) {
        blogService.deleteBlog(id);
        return ResponseEntity.noContent().build();
    }
}




