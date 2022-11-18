import io.ktor.client.*
import io.ktor.client.call.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.request.*
import io.ktor.serialization.kotlinx.json.*

object Api {
    val baseUrl = "https://paquita.masto.host/api/v1/"

    val jsonClient = HttpClient {
        install(ContentNegotiation) {
            json()
        }
    }

    suspend fun getInstanceData(): InstanceData {
        return jsonClient.get(baseUrl + "instance").body()
    }
}
