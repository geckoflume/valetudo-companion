package cloud.valetudo.companion

data class DiscoveredValetudoInstance (
    val id: String,
    val model: String,
    val manufacturer: String,
    val valetudoVersion: String,
    val host: String,
    val serviceName: String
) {
    override fun toString(): String = "$manufacturer $model ($host)"
}
