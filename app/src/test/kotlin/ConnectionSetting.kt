import com.charleskorn.kaml.Yaml
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
import kotlinx.serialization.decodeFromString

class ConnectionSetting {

    companion object {
        fun get(): Setting {
            return javaClass.classLoader.getResourceAsStream("connection-setting.yml").use {
                Yaml.default.decodeFromString(it!!.readBytes().decodeToString())
            }
        }
    }

    @Serializable
    data class Setting(val host: String, @SerialName("bearer-token") val bearerToken: String)
}
