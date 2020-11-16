package academy.mukandrew.randmcatalog.data.di

import academy.mukandrew.randmcatalog.data.repositories.CharacterRepositoryImpl
import academy.mukandrew.randmcatalog.repositories.CharacterRepository
import org.koin.dsl.module

class CharacterDataModule {
    val value = module {
        factory<CharacterRepository> { CharacterRepositoryImpl() }
    }
}