package com.kgfsl.fixme.service;

import com.kgfsl.fixme.model.Article;
import java.util.List;

public interface ArticleService1 {

public List<Article> getAllArticles();

public Article getArticleById(int articleId);

public void createArticle(Article article1);

public void updateArticle(Article article1);

public void deleteArticle(int articleId);
}