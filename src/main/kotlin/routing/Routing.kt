package com.example.routing

import io.ktor.http.HttpStatusCode
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*

fun Application.configureRouting() {
    routing {
        get("/health") {
            call.response.status(HttpStatusCode.OK)
        }
        get("/home") {
            call.response.status(HttpStatusCode.OK)
            }
        get("/") {
            call.respondRedirect("/home")
        }
    }
}
