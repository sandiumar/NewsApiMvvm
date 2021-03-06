package com.pratamawijaya.newsapimvvm.data.response

import com.pratamawijaya.newsapimvvm.data.model.ArticleModel

data class TopHeadlineResponse(
        val status: String,
        val totalResults: Int,
        val articles: List<ArticleModel>
)