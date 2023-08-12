package fastcampus.issueservice.exception

sealed class ServeException(
    val code: Int,
    override val message: String,
) : RuntimeException(message)

data class NotFoundException(
    override val message: String,
) : ServeException(404, message)

data class UnauthorizedException(
    override val message: String = "인증 정보가 잘못되었습니다.",
) : ServeException(401, message)