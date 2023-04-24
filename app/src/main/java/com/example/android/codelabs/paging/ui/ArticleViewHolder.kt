package com.example.android.codelabs.paging.ui

import androidx.recyclerview.widget.RecyclerView
import com.example.android.codelabs.paging.data.Article
import com.example.android.codelabs.paging.data.createdText
import com.example.android.codelabs.paging.databinding.ArticleViewholderBinding

class ArticleViewHolder(
    private val binding: ArticleViewholderBinding
) : RecyclerView.ViewHolder(binding.root) {

    fun bind(article: Article) {
        binding.apply {
            binding.title.text = article.title
            binding.description.text = article.description
            binding.created.text = article.createdText
        }
    }
}
