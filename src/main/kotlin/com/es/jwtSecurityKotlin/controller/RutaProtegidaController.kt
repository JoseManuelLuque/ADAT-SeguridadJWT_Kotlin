package com.es.jwtSecurityKotlin.controller

import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rutas_protegidas")
class RutaProtegidaController {


    @GetMapping("/recurso1")
    fun getRecursoProtegidoUno () : String {
        return "Este recurso sólo puede ser accedido por usuarios registrados en la BDD \uD83E\uDD75"
    }

    @PostMapping("/recurso2")
    fun getRecurso() : String {
        return "Recurso2"
    }

    @GetMapping("/recurso/{id}")
    fun getRecursoProtegidoTres(@PathVariable id: String) : String {
        return "Recurso $id"
    }

    @DeleteMapping("/recurso/{id}")
    fun deleteRecurso(@PathVariable id: String) : String {
        return "Recurso $id eliminado"
    }

}