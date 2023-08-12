package fastcampus.issueservice.domain.enums

enum class IssuePriority {

    LOW, MIDIUM, HIGE;

    companion object {
        operator fun invoke(priority: String) = valueOf(priority.uppercase())
    }
}
