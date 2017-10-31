package com.kgfsl.fixme.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.kgfsl.fixme.model.Article;
import com.kgfsl.fixme.repository.ArticleRepository;
import java.util.List;

@Service
public class ArticleServiceImpl implements ArticleService {
    @Autowired
    private ArticleRepository articleRepository;

    @Override
    public Article getArticleById(int articleId) {
        Article obj = articleRepository.findOne(articleId);
        return obj;
    }

    @Override
    public List<Article> getAllArticles() {
        return articleRepository.findAll();
    }

    @Override
    public void createArticle(Article article) {
        articleRepository.saveAndFlush(article);
    }

    @Override
    public void updateArticle(Article article) {
        articleRepository.saveAndFlush(article);
    }

    @Override
    public void deleteArticle(int articleId) {
        articleRepository.delete(articleId);
    }
}