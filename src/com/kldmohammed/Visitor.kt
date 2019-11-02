package com.kldmohammed

import GoodTime

class Visitor {
    var horizon: Int = 0
    val firstImpression: String = ""
    private val interest: String = ""
    val status: VisitorStatus = VisitorStatus.Lost
    val friendsList: ArrayList<Visitor> = arrayListOf()

    fun learn(topic: ArrayList<String>) {

    }


    fun interest(): String {
        return interest
    }

    fun respectOthers() {
        println("Respect others")
    }

    fun supportDiversity() {
        println("Support Diversity")
    }

    fun againstDiscrimination() {
        println("against Discrimination")
    }

    fun addFriends(newFriend: Visitor) {
        friendsList.add(newFriend)
    }

    fun have(goodTime: GoodTime) {

    }

    fun getFriend(newFriend: Visitor): Visitor {
        return this
    }
}


enum class VisitorStatus {
    Lost
}