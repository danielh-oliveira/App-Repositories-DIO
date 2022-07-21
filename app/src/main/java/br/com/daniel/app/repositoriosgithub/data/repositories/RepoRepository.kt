package br.com.daniel.app.repositoriosgithub.data.repositories

import br.com.daniel.app.repositoriosgithub.data.model.Repo
import kotlinx.coroutines.flow.Flow

interface RepoRepository {
    suspend fun listRepositories(user: String): Flow<List<Repo>>
}