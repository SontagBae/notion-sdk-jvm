package notion.api.v1.request.blocks

// var is intentional here (for the easiness in other JVM languages)
data class DeleteBlockRequest
@JvmOverloads
constructor(
    val blockId: String,
)
