package com.kldmohammed

import kotlin.math.floor
import kotlin.math.roundToInt

val tracks = arrayListOf<String>()


fun provideKnowledge(visitor: Visitor) {
    val topics = tracks.filter { track -> track == visitor.interest() }
    visitor.learn(Talks().getTalks(topics).extractKnowledge())
}


fun haveFun(visitor: Visitor) {
    val entertainment = Entertainment()
    entertainment.playVRGames()
    entertainment.playKicker()
    entertainment.playConsoles()
    entertainment.gotoAfterParty()
    if (visitor.status == VisitorStatus.Lost) {
        getMoreInformation("When is my talk?")
    }
    visitor.have(GoodTime(visitor))
}

fun connectPeople(visitor: Visitor, visitors: List<Visitor>) {
    startConversation()
    val newFriend = visitors[floor(Math.random() * (visitors.size - 1)).roundToInt()]
    visitor.addFriends(newFriend)
    // visitor.friendsList[visitor.getFriend(newFriend).firstImpression == "awesome"]
    visitor.horizon++
}


fun followCodeOfConduct(visitor: Visitor): Boolean {
    return try {
        visitor.respectOthers()
        visitor.supportDiversity()
        visitor.againstDiscrimination()
        println("Enjoy newAndroidDev group!")
        true
    } catch (b: BadBehaviorException) {
        println("Sorry, not welcome :( ")
        false
    }
}

fun startConversation() {
    println("I'm a Developer, whats your Super proud .... ")
}

fun getMoreInformation(question: String) =
    when (question) {
        "When is my talk?" -> ""
        "I lost and i need help, what should i do ?" -> ""
        else -> "24"
    }



