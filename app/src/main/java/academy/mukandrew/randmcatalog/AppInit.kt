package academy.mukandrew.randmcatalog

import academy.mukandrew.randmcatalog.data.di.CharacterDataModule
import academy.mukandrew.randmcatalog.di.CharacterDomainModule
import academy.mukandrew.randmcatalog.di.EpisodeDomainModule
import academy.mukandrew.randmcatalog.di.LocationDomainModule
import android.app.Application
import org.koin.core.context.startKoin
import org.koin.core.module.Module

class AppInit : Application() {
    override fun onCreate() {
        super.onCreate()
        startKoin {
            modules(getModules())
        }
    }

    private fun getModules(): List<Module> {
        return listOf(
            CharacterDataModule().value,
            CharacterDomainModule().value,
            EpisodeDomainModule().value,
            LocationDomainModule().value
        )
    }
}