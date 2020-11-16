package academy.mukandrew.randmcatalog.di

import academy.mukandrew.randmcatalog.usecases.characters.abstracts.GetCharactersUseCase
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.ListPageCharactersUseCase
import academy.mukandrew.randmcatalog.usecases.characters.abstracts.SearchCharacterUseCase
import academy.mukandrew.randmcatalog.usecases.characters.implementations.GetCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.characters.implementations.ListPageCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.usecases.characters.implementations.SearchCharacterUseCaseImpl
import org.koin.dsl.module

class CharacterDomainModule {
    val value = module {
        single<GetCharactersUseCase> { GetCharactersUseCaseImpl(get()) }
        single<ListPageCharactersUseCase> { ListPageCharactersUseCaseImpl(get()) }
        single<SearchCharacterUseCase> { SearchCharacterUseCaseImpl(get()) }
    }
}