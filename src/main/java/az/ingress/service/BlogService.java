package az.ingress.service;

import az.ingress.entity.BlogEntity;
import az.ingress.repository.BlogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BlogService  implements BlogServiceImp{
 private  final    BlogRepository  blogRepository;


 @Override
 public List<BlogEntity> getAllBlogs() {
    return blogRepository.findAll();
 }

 @Override
 public BlogEntity getBlogById(Long id) {
  return blogRepository.findById(id).
          orElseThrow(() -> new RuntimeException("Blog not found with id:"+ id));
 }

 @Override
 public BlogEntity createBlog(BlogEntity blog) {
  return blogRepository.save(blog);
 }

 @Override
 public BlogEntity updateBlog(Long id, BlogEntity blog) {
     var existingBlog = getBlogById(id);
     existingBlog.setImageUrl(blog.getImageUrl());
  existingBlog.setContent(blog.getContent());
  existingBlog.setAuthor(blog.getAuthor());
  existingBlog.setCreatedAt(blog.getCreatedAt());
  existingBlog.setContent(blog.getContent());
  existingBlog.setTitle(blog.getTitle());
 return blogRepository.save(existingBlog);


 }

 @Override
 public void deleteBlog(Long id) {
   if (!blogRepository.existsById(id)){
    throw  new RuntimeException("Blog not found with id :"+ id);
   }
   blogRepository.deleteById(id);
 }
}
