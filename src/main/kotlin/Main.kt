package org.example

import com.google.gson.Gson
import java.net.URI
import java.net.http.HttpClient
import java.net.http.HttpRequest
import java.net.http.HttpResponse

fun main() {

    val client: HttpClient = HttpClient.newHttpClient()
    val request: HttpRequest = HttpRequest.newBuilder()
        .uri(URI.create("https://www.cheapshark.com/api/1.0/games?id=146"/*"https://www.cheapshark.com/api/1.0/games?title=batman"*/))
        .build()

    val response = client.send(request, HttpResponse.BodyHandlers.ofString())
    val json = response.body()
    val gson = Gson()

    val myGame = gson.fromJson(json, infoGame::class.java)
    println(myGame)


}