package academy.mukandrew.randmcatalog.models.entities

import academy.mukandrew.randmcatalog.models.contracts.EpisodeContract

data class EpisodeEntity(
    override val id: Int,
    override val name: String?,
    override val airDate: String?,
    override val number: String?,
    override val characters: List<Int>?,
) : EpisodeContract()