package academy.mukandrew.randmcatalog.domain.usecases

import academy.mukandrew.randmcatalog.commons.utils.Response
import academy.mukandrew.randmcatalog.domain.models.Character
import academy.mukandrew.randmcatalog.domain.models.Episode
import academy.mukandrew.randmcatalog.domain.models.Location

typealias CharactersResponse = Response<List<Character>>
typealias EpisodesResponse = Response<List<Episode>>
typealias LocationsResponse = Response<List<Location>>