package com.kgfsl.fixme.controller;


import com.kgfsl.fixme.model.Article;
import com.kgfsl.fixme.service.ArticleServiceImpl1;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping("user")
@CrossOrigin(origins = { "http://localhost:4200" })
public class ArticleController1 {
@Autowired
private ArticleServiceImpl1 articleServiceImpl1;


@GetMapping("article")
public ResponseEntity<Article> getArticleById(@RequestParam("id") String id) {
Article article = articleServiceImpl1.getArticleById(Integer.parseInt(id));
return new ResponseEntity<Article>(article, HttpStatus.OK);
}

@GetMapping("all-articles")
public ResponseEntity<List<Article>> getAllArticles() {
List<Article> list = articleServiceImpl1.getAllArticles();
return new ResponseEntity<List<Article>>(list, HttpStatus.OK);
}

@PostMapping("article")
public ResponseEntity<Void> createArticle(@RequestBody Article article, UriComponentsBuilder builder) {
articleServiceImpl1.createArticle(article);
HttpHeaders headers  = new HttpHeaders();
headers.setLocation(builder.path("/article?id={id}").buildAndExpand(article.getArticleId()).toUri());
return new ResponseEntity<Void>(headers, HttpStatus.CREATED);
}

@PutMapping("article")
public ResponseEntity<Article> updateArticle(@RequestBody Article article1) {
articleServiceImpl1.updateArticle(article1);
return new ResponseEntity<Article>(article1, HttpStatus.OK);
}

@DeleteMapping("article")
public ResponseEntity<Void> deleteArticle(@RequestParam("id") String id) {
articleServiceImpl1.deleteArticle(Integer.parseInt(id));
return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
}
}