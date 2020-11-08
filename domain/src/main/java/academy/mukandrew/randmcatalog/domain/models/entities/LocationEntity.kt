package academy.mukandrew.randmcatalog.domain.models.entities

import academy.mukandrew.randmcatalog.domain.models.contracts.LocationContract

data class LocationEntity(
    override val id: Int,
    override val name: String,
    override val type: String,
    override val dimension: String,
    override val residents: List<String>
) : LocationContract()