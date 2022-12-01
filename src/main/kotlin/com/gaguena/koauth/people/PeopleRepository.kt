package com.gaguena.koauth.people

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.Optional

@Repository
interface PeopleRepository: JpaRepository<PeopleEntity, Long> {
    fun findByDocument(document: String?): Optional<PeopleEntity>;
}