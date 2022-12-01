package com.gaguena.koauth.people

import javax.persistence.*

@Entity
@Table(name = "TB_PEOPLE")
data class PeopleEntity(
    @Id
    @GeneratedValue
    @Column(name = "PEOPLE_ID")
    val id: Long? = null,
    @Column(name = "PEOPLE_NAME", length = 120)
    val name: String,
    @Column(name = "PEOPLE_DOCUMENT", length = 16)
    val document: String,
)
