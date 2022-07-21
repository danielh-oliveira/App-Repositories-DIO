package br.com.daniel.app.repositoriosgithub.data.repositories

import br.com.daniel.app.repositoriosgithub.core.RemoteException
import br.com.daniel.app.repositoriosgithub.data.services.GitHubService
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException

class RepoRepositoryImpl(private val service: GitHubService) : RepoRepository {

    override suspend fun listRepositories(user: String) = flow {
        try {
            val repoList = service.listRepositories(user)
            emit(repoList)
        } catch (e: HttpException) {
            throw RemoteException(e.message ?: "Não foi possivel fazer a busca")
        }
    }
}