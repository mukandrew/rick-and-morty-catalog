package academy.mukandrew.randmcatalog.domain.usecases

import academy.mukandrew.randmcatalog.commons.utils.Response
import academy.mukandrew.randmcatalog.domain.models.contracts.CharacterContract
import academy.mukandrew.randmcatalog.domain.models.contracts.EpisodeContract
import academy.mukandrew.randmcatalog.domain.models.contracts.LocationContract

typealias CharactersResponse = Response<List<CharacterContract>>
typealias EpisodesResponse = Response<List<EpisodeContract>>
typealias LocationsResponse = Response<List<LocationContract>>