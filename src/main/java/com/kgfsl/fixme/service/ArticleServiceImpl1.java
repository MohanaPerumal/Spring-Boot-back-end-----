package com.kgfsl.fixme.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kgfsl.fixme.model.Article;
import com.kgfsl.fixme.repository.ArticleRepository1;
import java.util.List;

@Service
public class ArticleServiceImpl1 implements ArticleService1 {
    @Autowired
    private ArticleRepository1 articleRepository1;

    @Override
    public Article getArticleById(int articleId) {
        Article obj = articleRepository1.findOne(articleId);
        return obj;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository1.findAll();
    }

    @Override
    public void createArticle(Article article) {
        articleRepository1.saveAndFlush(article);
    }

    @Override
    public void updateArticle( Article article) {
        articleRepository1.saveAndFlush(article);
    }

    @Override
    public void deleteArticle(int articleId) {
        articleRepository1.delete(articleId);
    }
}