package academy.mukandrew.randmcatalog.domain.di

import academy.mukandrew.randmcatalog.data.repositories.CharacterRepositoryImpl
import academy.mukandrew.randmcatalog.domain.usecases.characters.implementations.GetCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.characters.implementations.ListPageCharactersUseCaseImpl
import academy.mukandrew.randmcatalog.domain.usecases.characters.implementations.SearchCharacterUseCaseImpl
import org.koin.core.qualifier.named
import org.koin.dsl.module

class CharacterDomainModule {
    operator fun invoke() = module {
        single(named("CharacterRepository")) { CharacterRepositoryImpl() }
        factory { GetCharactersUseCaseImpl(get(named("CharacterRepository"))) }
        factory { ListPageCharactersUseCaseImpl(get(named("CharacterRepository"))) }
        factory { SearchCharacterUseCaseImpl(get(named("CharacterRepository"))) }
    }
}