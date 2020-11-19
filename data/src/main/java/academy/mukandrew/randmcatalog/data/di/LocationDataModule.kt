package academy.mukandrew.randmcatalog.data.di

import academy.mukandrew.randmcatalog.data.remote.datasources.LocationRemoteDataSource
import academy.mukandrew.randmcatalog.data.repositories.LocationRepositoryImpl
import academy.mukandrew.randmcatalog.repositories.LocationRepository
import org.koin.dsl.module

class LocationDataModule {
    val value = module {
        factory { LocationRemoteDataSource(get()) }
        factory<LocationRepository> { LocationRepositoryImpl(get()) }
    }
}