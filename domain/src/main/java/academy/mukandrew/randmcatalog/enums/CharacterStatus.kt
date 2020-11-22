package academy.mukandrew.randmcatalog.enums

enum class CharacterStatus(val value: String) {
    ALIVE("alive"),
    DEAD("dead"),
    UNKNOWN("unknown");

    companion object {
        fun from(value: String?): CharacterStatus {
            return values().find { it.value == value } ?: UNKNOWN
        }
    }
}