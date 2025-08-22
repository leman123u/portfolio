package az.ingress.service;

import az.ingress.entity.BlogEntity;

import java.util.List;

public interface BlogServiceImp {


    List<BlogEntity> getAllBlogs();

    BlogEntity getBlogById(Long id);

    BlogEntity createBlog(BlogEntity blog);

    BlogEntity updateBlog(Long id, BlogEntity blog);

    void deleteBlog(Long id);
}
