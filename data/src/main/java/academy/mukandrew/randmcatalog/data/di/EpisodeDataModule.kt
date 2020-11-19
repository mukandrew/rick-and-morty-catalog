package academy.mukandrew.randmcatalog.data.di

import academy.mukandrew.randmcatalog.data.remote.datasources.EpisodeRemoteDataSource
import academy.mukandrew.randmcatalog.data.repositories.EpisodeRepositoryImpl
import academy.mukandrew.randmcatalog.repositories.EpisodeRepository
import org.koin.dsl.module

class EpisodeDataModule {
    val value = module {
        factory { EpisodeRemoteDataSource(get()) }
        factory<EpisodeRepository> { EpisodeRepositoryImpl(get()) }
    }
}