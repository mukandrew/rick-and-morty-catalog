package academy.mukandrew.randmcatalog.domain.di

import academy.mukandrew.randmcatalog.data.repositories.LocationRepositoryImpl
import academy.mukandrew.randmcatalog.domain.usecases.locations.implementations.GetLocationsUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.locations.implementations.ListPageLocationsUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.locations.implementations.SearchLocationUseCaseImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

class LocationDomainModule {
    operator fun invoke() = module {
        single(named("LocationRepository")) { LocationRepositoryImpl() }
        factory { GetLocationsUseCaseImpl(get(named("LocationRepository"))) }
        factory { ListPageLocationsUseCaseImpl(get(named("LocationRepository"))) }
        factory { SearchLocationUseCaseImpl(get(named("LocationRepository"))) }
    }
}