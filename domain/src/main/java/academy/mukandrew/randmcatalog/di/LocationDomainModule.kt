package academy.mukandrew.randmcatalog.di

import academy.mukandrew.randmcatalog.usecases.locations.abstracts.GetLocationsUseCase
import academy.mukandrew.randmcatalog.usecases.locations.abstracts.ListPageLocationsUseCase
import academy.mukandrew.randmcatalog.usecases.locations.abstracts.SearchLocationUseCase
import academy.mukandrew.randmcatalog.usecases.locations.implementations.GetLocationsUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.locations.implementations.ListPageLocationsUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.locations.implementations.SearchLocationUseCaseImpl
import org.koin.dsl.module

class LocationDomainModule {
    val value = module {
        single<GetLocationsUseCase> { GetLocationsUseCaseImpl(get()) }
        single<ListPageLocationsUseCase> { ListPageLocationsUseCaseImpl(get()) }
        single<SearchLocationUseCase> { SearchLocationUseCaseImpl(get()) }
    }
}