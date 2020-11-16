package academy.mukandrew.randmcatalog.models.entities

import academy.mukandrew.randmcatalog.models.contracts.LocationContract

data class LocationEntity(
    override val id: Int,
    override val name: String?,
    override val type: String?,
    override val dimension: String?,
    override val residents: List<String>?,
    override val url: String?,
) : LocationContract()