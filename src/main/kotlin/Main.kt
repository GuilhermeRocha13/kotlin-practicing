package org.example

import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {

    var client: HttpClient = HttpClient.newHttpClient()
    var request: HttpRequest = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"/*"https://www.cheapshark.com/api/1.0/games?title=batman"*/))
        .build()

    var response = client.send(request, HttpResponse.BodyHandlers.ofString())
    val json = response.body()
    println(json)
}