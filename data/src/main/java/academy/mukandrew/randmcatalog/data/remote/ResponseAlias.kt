package academy.mukandrew.randmcatalog.data.remote

import academy.mukandrew.randmcatalog.data.remote.responses.CharacterSchema
import academy.mukandrew.randmcatalog.data.remote.responses.EpisodeSchema
import academy.mukandrew.randmcatalog.data.remote.responses.LocationSchema
import academy.mukandrew.randmcatalog.utils.Response

typealias CharactersResponse = Response<List<CharacterSchema>>
typealias EpisodesResponse = Response<List<EpisodeSchema>>
typealias LocationsResponse = Response<List<LocationSchema>>