package br.com.daniel.app.repositoriosgithub

import android.app.Application
import br.com.daniel.app.repositoriosgithub.data.di.DataModule
import br.com.daniel.app.repositoriosgithub.domain.di.DomainModule
import br.com.daniel.app.repositoriosgithub.presentation.di.PresentationModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class App : Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidContext(this@App)
        }

        DataModule.load()
        DomainModule.load()
        PresentationModule.load()
    }
}