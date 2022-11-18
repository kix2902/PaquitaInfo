import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class InstanceData(
    @SerialName("approval_required")
    val approvalRequired: Boolean,
    val configuration: Configuration,
    @SerialName("contact_account")
    val contactAccount: ContactAccount,
    val description: String,
    val email: String,
    @SerialName("invites_enabled")
    val invitesEnabled: Boolean,
    val languages: List<String>,
    val registrations: Boolean,
    val rules: List<Rule>,
    @SerialName("short_description")
    val shortDescription: String,
    val stats: Stats,
    val thumbnail: String,
    val title: String,
    val uri: String,
    val urls: Urls,
    val version: String
)

@Serializable
data class Configuration(
    val accounts: Accounts,
    @SerialName("media_attachments")
    val mediaAttachments: MediaAttachments,
    val polls: Polls,
    val statuses: Statuses
)

@Serializable
data class ContactAccount(
    val acct: String,
    val avatar: String,
    @SerialName("avatar_static")
    val avatarStatic: String,
    val bot: Boolean,
    @SerialName("created_at")
    val createdAt: String,
    val discoverable: Boolean,
    @SerialName("display_name")
    val displayName: String,
    val emojis: List<String>,
    val fields: List<Field>,
    @SerialName("followers_count")
    val followersCount: Int,
    @SerialName("following_count")
    val followingCount: Int,
    val group: Boolean,
    val header: String,
    @SerialName("header_static")
    val headerStatic: String,
    val id: String,
    @SerialName("last_status_at")
    val lastStatusAt: String,
    val locked: Boolean,
    val noindex: Boolean,
    val note: String,
    @SerialName("statuses_count")
    val statusesCount: Int,
    val url: String,
    val username: String
)

@Serializable
data class Rule(
    val id: String,
    val text: String
)

@Serializable
data class Stats(
    @SerialName("domain_count")
    val domainCount: Int,
    @SerialName("status_count")
    val statusCount: Int,
    @SerialName("user_count")
    val userCount: Int
)

@Serializable
data class Urls(
    @SerialName("streaming_api")
    val streamingApi: String
)

@Serializable
data class Accounts(
    @SerialName("max_featured_tags")
    val maxFeaturedTags: Int
)

@Serializable
data class MediaAttachments(
    @SerialName("image_matrix_limit")
    val imageMatrixLimit: Int,
    @SerialName("image_size_limit")
    val imageSizeLimit: Int,
    @SerialName("supported_mime_types")
    val supportedMimeTypes: List<String>,
    @SerialName("video_frame_rate_limit")
    val videoFrameRateLimit: Int,
    @SerialName("video_matrix_limit")
    val videoMatrixLimit: Int,
    @SerialName("video_size_limit")
    val videoSizeLimit: Int
)

@Serializable
data class Polls(
    @SerialName("max_characters_per_option")
    val maxCharactersPerOption: Int,
    @SerialName("max_expiration")
    val maxExpiration: Int,
    @SerialName("max_options")
    val maxOptions: Int,
    @SerialName("min_expiration")
    val minExpiration: Int
)

@Serializable
data class Statuses(
    @SerialName("characters_reserved_per_url")
    val charactersReservedPerUrl: Int,
    @SerialName("max_characters")
    val maxCharacters: Int,
    @SerialName("max_media_attachments")
    val maxMediaAttachments: Int
)

@Serializable
data class Field(
    val name: String,
    val value: String,
    @SerialName("verified_at")
    val verifiedAt: String?
)
