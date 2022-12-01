package com.gaguena.koauth.people

data class PeopleData(val code: Long?, val name: String, val document: String) {
    companion object {
        fun create(people: PeopleEntity): PeopleData = PeopleData(people.id, people.name, people.document);
    }
}
