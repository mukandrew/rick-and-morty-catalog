package academy.mukandrew.randmcatalog.usecases

import academy.mukandrew.randmcatalog.models.contracts.CharacterContract
import academy.mukandrew.randmcatalog.models.contracts.EpisodeContract
import academy.mukandrew.randmcatalog.models.contracts.LocationContract
import academy.mukandrew.randmcatalog.utils.Response

typealias CharactersResponse = Response<List<CharacterContract>>
typealias EpisodesResponse = Response<List<EpisodeContract>>
typealias LocationsResponse = Response<List<LocationContract>>