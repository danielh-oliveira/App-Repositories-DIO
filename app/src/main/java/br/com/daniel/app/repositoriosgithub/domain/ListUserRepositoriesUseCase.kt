package br.com.daniel.app.repositoriosgithub.domain

import br.com.daniel.app.repositoriosgithub.core.UseCase
import br.com.daniel.app.repositoriosgithub.data.model.Repo
import br.com.daniel.app.repositoriosgithub.data.repositories.RepoRepository
import kotlinx.coroutines.flow.Flow

class ListUserRepositoriesUseCase(
    private val repository: RepoRepository
) : UseCase<String, List<Repo>>() {

    override suspend fun execute(param: String): Flow<List<Repo>> {
        return repository.listRepositories(param)
    }
}