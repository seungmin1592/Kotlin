package fastcampus.issueservice.domain.enums

enum class IssueStatue {

    TODO, IN_PROGRESS, RESOLVED;

    companion object {
        operator fun invoke(status: String) = valueOf(status.uppercase())
    }

}
