package com.example.todolist

import com.example.todolist.application.TodoService
import com.example.todolist.domain.Todo
import com.example.todolist.domain.TodoRepository
import io.mockk.every
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.data.repository.findByIdOrNull
import org.springframework.test.context.junit.jupiter.SpringExtension
import java.time.LocalDateTime

@ExtendWith(SpringExtension::class)
class TodoServiceTest {

    @MockBean
    lateinit var repository: TodoRepository

    lateinit var service: TodoService

    val stub: Todo by lazy {
        Todo(
            id = 1,
            title = "테스트",
            description = "테스트 상세",
            done = false,
            createdAt = LocalDateTime.now(),
            updatedAt = LocalDateTime.now(),
        )
    }

    @BeforeEach
    fun setUp() {
        service = TodoService(repository)
    }

    @Test
    fun `합계의 TODO를 반환해야한다`() {
        // given
        every { repository.findByIdOrNull(1) } returns stub

        // when
        val actual = service.findById(1)

        // then
        assertThat(actual).isNotNull
        assertThat(actual).isEqualTo(stub)
    }

}