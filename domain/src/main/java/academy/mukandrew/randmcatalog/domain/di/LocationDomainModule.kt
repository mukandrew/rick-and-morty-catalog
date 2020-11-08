package academy.mukandrew.randmcatalog.domain.di

import academy.mukandrew.randmcatalog.domain.usecases.locations.implementations.GetLocationsUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.locations.implementations.ListPageLocationsUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.locations.implementations.SearchLocationUseCaseImpl
import org.koin.dsl.module

class LocationDomainModule {
    operator fun invoke() = module {
        factory { GetLocationsUseCaseImpl(get()) }
        factory { ListPageLocationsUseCaseImpl(get()) }
        factory { SearchLocationUseCaseImpl(get()) }
    }
}