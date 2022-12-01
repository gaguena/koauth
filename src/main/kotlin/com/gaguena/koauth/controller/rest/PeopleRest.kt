package com.gaguena.koauth.controller.rest

import com.gaguena.koauth.people.PeopleData
import com.gaguena.koauth.people.PeopleService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("peoples")
class PeopleRest(private val peopleService: PeopleService) {

    @GetMapping("/documents/{document}")
    fun filter(@PathVariable document: String): ResponseEntity<PeopleData> {
        val result = peopleService.filter(document);
        return ResponseEntity.ok(result);
    }

    @PostMapping("/")
    fun create(@RequestBody people: PeopleData) {
        this.peopleService.save(people);
    }

    @PutMapping("/{code}")
    fun update(@PathVariable code: Long, @RequestBody data: PeopleData) {

    }
}