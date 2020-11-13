package academy.mukandrew.randmcatalog.domain.di

import academy.mukandrew.randmcatalog.data.repositories.EpisodeRepositoryImpl
import academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations.GetEpisodesUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations.ListPageEpisodesUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.episodes.implementations.SearchEpisodeUseCaseImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

class EpisodeDomainModule {
    operator fun invoke() = module {
        single(named("EpisodeRepository")) { EpisodeRepositoryImpl() }
        factory { GetEpisodesUseCaseImpl(get(named("EpisodeRepository"))) }
        factory { ListPageEpisodesUseCaseImpl(get(named("EpisodeRepository"))) }
        factory { SearchEpisodeUseCaseImpl(get(named("EpisodeRepository"))) }
    }
}