package com.gaguena.koauth.people

import com.gaguena.koauth.exception.NotFoundException
import org.springframework.stereotype.Service

@Service
class PeopleService(private val peopleRespository: PeopleRepository) {
    fun filter(document: String): PeopleData {
        val result = peopleRespository.findByDocument(document).orElse(null);
        return result?.let {PeopleData.create(it)}?: throw NotFoundException("");
    }
    fun save(data: PeopleData): PeopleData {
        val people = PeopleEntity(name = data.name, document = data.document)
        return peopleRespository.save(people)?.let  {PeopleData.create(it)}
    }
}