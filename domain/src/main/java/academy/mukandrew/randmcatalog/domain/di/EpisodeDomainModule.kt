package academy.mukandrew.randmcatalog.domain.di

import academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations.GetEpisodesUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations.ListPageEpisodesUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations.SearchEpisodeUseCaseImpl
import org.koin.dsl.module

class EpisodeDomainModule {
    operator fun invoke() = module {
        factory { GetEpisodesUseCaseImpl(get()) }
        factory { ListPageEpisodesUseCaseImpl(get()) }
        factory { SearchEpisodeUseCaseImpl(get()) }
    }
}