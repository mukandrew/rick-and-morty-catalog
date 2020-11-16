package academy.mukandrew.randmcatalog.di

import academy.mukandrew.randmcatalog.usecases.episodes.abstracts.GetEpisodesUseCase
import academy.mukandrew.randmcatalog.usecases.episodes.abstracts.ListPageEpisodesUseCase
import academy.mukandrew.randmcatalog.usecases.episodes.abstracts.SearchEpisodeUseCase
import academy.mukandrew.randmcatalog.usecases.episodes.implementations.GetEpisodesUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.episodes.implementations.ListPageEpisodesUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.episodes.implementations.SearchEpisodeUseCaseImpl
import org.koin.dsl.module

class EpisodeDomainModule {
    val value = module {
        single<GetEpisodesUseCase> { GetEpisodesUseCaseImpl(get()) }
        single<ListPageEpisodesUseCase> { ListPageEpisodesUseCaseImpl(get()) }
        single<SearchEpisodeUseCase> { SearchEpisodeUseCaseImpl(get()) }
    }
}