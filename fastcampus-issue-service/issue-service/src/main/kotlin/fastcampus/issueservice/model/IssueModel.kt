package fastcampus.issueservice.model

import com.fasterxml.jackson.annotation.JsonFormat
import fastcampus.issueservice.domain.Issue
import fastcampus.issueservice.domain.enums.IssuePriority
import fastcampus.issueservice.domain.enums.IssueStatue
import fastcampus.issueservice.domain.enums.IssueType
import java.time.LocalDateTime

data class IssueRequest (

    val summary : String,
    val description: String,
    val type : IssueType,
    val priority: IssuePriority,
    val status : IssueStatue
)

data class IssueResponse(

    val id: Long,
    val summary: String,
    val description: String,
    val userId: Long,
    val type: IssueType,
    val priority: IssuePriority,
    val status: IssueStatue,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val createdAt: LocalDateTime?,
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    val updatedAt: LocalDateTime?,

    ){
    companion object{
        operator fun invoke(issue: Issue) =
            with(issue) {
                IssueResponse(
                    id = id!!,
                    summary =summary,
                    description =description,
                    userId =userId,
                    type =type,
                    priority =priority,
                    status =status,
                    createdAt =createdAt,
                    updatedAt =updatedAt
                )
            }
    }
}